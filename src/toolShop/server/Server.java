package toolShop.server;

import toolShop.InventoryService;
import toolShop.LoginService;
import toolShop.OrderService;
import toolShop.SupplierService;
import toolShop.repositories.SupplierRepository;
import toolShop.repositories.ToolRepository;
import toolShop.repositories.UserRepository;

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
     * The tool repository service.
     */
    private ToolRepository toolRepository;

    /**
     * The supplier repository service.
     */
    private SupplierRepository supplierRepository;

    /**
     * The user repository.
     */
    private UserRepository userRepository;

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

        //DATABASE:
        toolRepository = new DatabaseToolRepository(new ToolDataTable());
        supplierRepository = new DatabaseSupplierRepository(new SupplierDataTable());
        userRepository = new DatabaseUserRepository(new UserDataTable());
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

        InventoryService inventory = new LinkedInventoryService(toolRepository);
        SupplierService supplierService = new LinkedSupplierService(supplierRepository);
        OrderService orderService = new LinkedOrderService(toolRepository);
        LoginService loginService = new LinkedLoginService(userRepository);

        RequestHandler requestHandler = new ClientRequestHandler(
                inventory,
                supplierService,
                orderService,
                loginService);

        ClientSession session = new ClientSession(connection, requestHandler);

        System.out.println("Client connected.");
        executorService.execute(session);
    }
}
