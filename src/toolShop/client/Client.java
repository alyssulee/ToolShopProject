package toolShop.client;

import java.io.IOException;
import java.net.Socket;

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
     */
    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /**
     * The client program entry point.
     */
    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 8098);
        client.start();
    }

    /**
     * Starts a session with the tool shop server. Blocks until the session ends.
     */
    public void start() throws IOException {
        connection = establishConnection(host, port);
        // --------
        connection.close();
    }

    /**
     * Establish a connection with the server in preparation of a session.
     */
    private ServerConnection establishConnection(String host, int port) throws IOException {
        System.out.println("Connecting to server...");

        socket = new Socket(host, port);

        ServerConnection connection = new ServerConnection(socket);
        System.out.println("Connected to server.");
        return connection;
    }
}
