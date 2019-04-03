package toolShop.server;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConnection
{
    /**
     * The socket though which communication with the client takes place.
     */
    private Socket socket;

    /**
     * The object stream for reading serialized objects from the client.
     */
    private ObjectInputStream objectReader;

    /**
     * The object stream for writing serialized objects to the client.
     */
    private ObjectOutputStream objectWriter;

    /**
     * Creates a new client connection on the supplied socket.
     */
    public ClientConnection(Socket socket) throws IOException
    {
        this.socket = socket;

        objectWriter = new ObjectOutputStream(socket.getOutputStream());
        objectReader = new ObjectInputStream(socket.getInputStream());
    }

    /**
     * Listen for a request from the client. This method blocks.
     *
     * @return The request received from the client.
     */
    public Request listenForRequest() throws IOException
    {
        try
        {
            return (Request) objectReader.readObject();

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            throw new Error("Unexpected exception thrown.");
        }
    }

    /**
     * Send a response to the client.
     */
    public void sendResponse(Response response) throws IOException
    {
        objectWriter.writeObject(response);
    }

    /**
     * Close all connections to the client.
     */
    public void close() throws IOException
    {
        objectReader.close();
        objectWriter.close();
        socket.close();
    }
}
