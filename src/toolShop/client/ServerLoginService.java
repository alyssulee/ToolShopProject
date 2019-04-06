package toolShop.client;

import toolShop.LoginService;
import toolShop.communication.requests.LoginRequest;
import toolShop.communication.responses.SuccessResponse;
import toolShop.models.UserType;

import java.io.IOException;

/**
 * A login service connected to the server.
 */
public class ServerLoginService implements LoginService
{
    /**
     * The server connection.
     */
    private ServerConnection connection;

    /**
     * Creates a server login service.
     *
     * @param connection The server connection.
     */
    public ServerLoginService(ServerConnection connection)
    {
        this.connection = connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean login(String username, String password, UserType userType)
    {
        try
        {
            LoginRequest request = new LoginRequest(username, password, userType);
            SuccessResponse response = (SuccessResponse) connection.sendRequest(request);
            return response.isSuccess();

        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
