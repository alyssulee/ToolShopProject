package toolShop.client;

import toolShop.InventoryService;
import toolShop.LoginService;
import toolShop.OrderService;
import toolShop.SupplierService;

import java.io.IOException;
import java.net.Socket;

/**
 * A tool shop client that exposes inventory management functionality though a connection to a server.
 */
public class Client
{
    /**
     * The host address.
     */
    private String host;

    /**
     * The port to bind to.
     */
    private int port;

    /**
     * The socket though which communication with the server takes place.
     */
    private Socket socket;

    /**
     * An abstraction of the connection to the server.
     */
    private ServerConnection connection;

    /**
     * Creates a new tool shop client.
     *
     * @param host The host address.
     * @param port The port.
     */
    public Client(String host, int port)
    {
        this.host = host;
        this.port = port;
    }

    /**
     * The client program entry point.
     */
    public static void main(String[] args) throws IOException
    {
        Client client = new Client("localhost", 8098);
        client.start();
    }

    /**
     * Starts a session with the tool shop server. Blocks until the session ends.
     */
    public void start() throws IOException
    {
        connection = establishConnection(host, port);
        System.out.println("Connected to server.");

        // Use this LoginService for attempting logins
        LoginService loginService = new ServerLoginService(connection);

        // Use this InventoryService for accessing tools
        InventoryService inventory = new ServerInventoryService(connection);

        // Use this SupplierService for accessing suppliers
        SupplierService supplierService = new ServerSupplierService(connection);

        // Use this order service for accessing orders
        OrderService orderService = new ServerOrderService(connection);

        // Use this order formatter service for producing order prints
        OrderFormatter orderFormatter = new GuiOrderFormatter(inventory, supplierService);

        ClientController controller = new ClientController(new GUI(), inventory, orderService, orderFormatter);

        // Todo: Wait for user to exit then terminate connection
        //connection.close();
    }

    /**
     * Establish a connection with the server in preparation of a session.
     *
     * @param host The host address.
     * @param port The port.
     * @return The connection.
     */
    private ServerConnection establishConnection(String host, int port) throws IOException
    {
        System.out.println("Connecting to server...");

        socket = new Socket(host, port);

        return new ServerConnection(socket);
    }
}
