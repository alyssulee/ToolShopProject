package toolShop.server;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

import java.io.IOException;

public class ClientSession implements Runnable
{
    private ClientConnection connection;
    private RequestHandler requestHandler;

    public ClientSession(ClientConnection connection, RequestHandler requestHandler)
    {
        this.connection = connection;
        this.requestHandler = requestHandler;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Request request = connection.listenForRequest();
                Response response = requestHandler.handelRequest(request);
                connection.sendResponse(response);
            }

        } catch (IOException e)
        {
            // An IO exception is thrown when the client disconnects
            try
            {
                connection.close();
                System.out.println("Client disconnected");

            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }
    }
}
