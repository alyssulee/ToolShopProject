package toolShop.client;

import toolShop.LoginService;
import toolShop.communication.requests.LoginRequest;
import toolShop.communication.responses.SuccessResponse;
import toolShop.models.UserType;

import java.io.IOException;

public class ServerLoginService implements LoginService
{
    private ServerConnection connection;

    public ServerLoginService(ServerConnection connection)
    {
        this.connection = connection;
    }

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
