/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

import java.io.IOException;

/**
 * Manages a client session.
 */
public class ClientSession implements Runnable
{
    /**
     * The connection to the client.
     */
    private ClientConnection connection;

    /**
     * The request handler.
     */
    private RequestHandler requestHandler;

    /**
     * Creates a client session.
     *
     * @param connection The connection to the client.
     */
    public ClientSession(ClientConnection connection, RequestHandler requestHandler)
    {
        this.connection = connection;
        this.requestHandler = requestHandler;
    }

    /**
     * Begin and run the client session. This method blocks until the client disconnects.
     */
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Request request = connection.listenForRequest();
                Response response = requestHandler.handleRequest(request);
                connection.sendResponse(response);
            }

        } catch (IOException e)
        {
            // An IO exception is thrown when the client disconnects
            try
            {
                connection.close();
                System.out.println("Client disconnected.");

            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }
}
