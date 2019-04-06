package toolShop.client;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * An abstraction of a server connection.
 */
public class ServerConnection
{
    /**
     * The socket though which communication with the server takes place.
     */
    private Socket socket;

    /**
     * The object stream for reading serialized objects from the server.
     */
    private ObjectInputStream objectReader;

    /**
     * The object stream for writing serialized objects to the server.
     */
    private ObjectOutputStream objectWriter;

    /**
     * Creates a new server connection on the supplied socket.
     */
    public ServerConnection(Socket socket) throws IOException
    {
        this.socket = socket;

        objectWriter = new ObjectOutputStream(socket.getOutputStream());
        objectReader = new ObjectInputStream(socket.getInputStream());
    }

    /**
     * Send a request to the server and wait for a response.
     *
     * @param request The request to send.
     * @return The response received from the server.
     */
    public Response sendRequest(Request request) throws IOException
    {
        objectWriter.writeObject(request);

        try
        {
            return (Response) objectReader.readObject();

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            throw new Error("Unexpected exception thrown.");
        }

    }

    /**
     * Close all connections to the server.
     */
    public void close() throws IOException
    {
        objectReader.close();
        objectWriter.close();
        socket.close();
    }
}
