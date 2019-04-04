package toolShop.server;

import toolShop.InventoryService;
import toolShop.repositories.MemoryToolRepository;
import toolShop.repositories.ToolRepository;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A tool shop server that exposes inventory management functionality to clients over a network.
 */
public class Server
{
    /**
     * The port clients must bind to.
     */
    private int port;

    /**
     * The thread pool client threads will be executed on.
     */
    private ExecutorService executorService;

    /**
     * The inventory management service.
     */
    private InventoryService inventoryService;

    /**
     * Creates a new tool shop server.
     *
     * @param port       The port clients must bind to.
     * @param maxClients The maximum number of concurrent client connections allowed.
     */
    public Server(int port, int maxClients)
    {
        this.port = port;

        // Each client must have its own thread since Java IO is blocking
        executorService = Executors.newFixedThreadPool(maxClients);

        // Todo: Replace in-memory repository with database repository
        ToolRepository toolRepository = new MemoryToolRepository();
        inventoryService = new LinkedInventoryService(toolRepository);
    }

    /**
     * The server program entry point.
     */
    public static void main(String[] args) throws IOException
    {
        Server server = new Server(8098, 100);
        server.listen();
    }

    /**
     * Listens for clients and starts a session on each connection. This method runs indefinitely.
     */
    public void listen() throws IOException
    {
        System.out.println("Server is listening for clients.");

        ServerSocket serverSocket = new ServerSocket(port);

        while (true)
        {
            Socket socket = serverSocket.accept();
            createSession(socket);
        }
    }

    /**
     * Creates a session for a client on a background thread.
     */
    private void createSession(Socket socket) throws IOException
    {
        ClientConnection connection = new ClientConnection(socket);
        RequestHandler requestHandler = new ClientRequestHandler(inventoryService);

        ClientSession session = new ClientSession(connection, requestHandler);

        System.out.println("Client connected.");
        executorService.execute(session);
    }
}
