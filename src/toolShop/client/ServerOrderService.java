package toolShop.client;

import toolShop.OrderService;
import toolShop.communication.requests.ExecuteOrderRequest;
import toolShop.communication.requests.GetOrderRequest;
import toolShop.communication.responses.OrderResponse;
import toolShop.communication.responses.SuccessResponse;
import toolShop.models.Order;

import java.io.IOException;
import java.util.Date;

/**
 * An order service connected to the server.
 */
public class ServerOrderService implements OrderService
{
    /**
     * The server connection.
     */
    private ServerConnection connection;

    /**
     * Creates a server order service.
     *
     * @param connection The server connection.
     */
    public ServerOrderService(ServerConnection connection)
    {
        this.connection = connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order getOrder()
    {
        try
        {
            GetOrderRequest request = new GetOrderRequest();
            OrderResponse response = (OrderResponse) connection.sendRequest(request);
            return response.getOrder();

        } catch (IOException e)
        {
            e.printStackTrace();
            return new Order(0, new Date());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean executeOrder(Order order)
    {
        try
        {
            ExecuteOrderRequest request = new ExecuteOrderRequest(order);
            SuccessResponse response = (SuccessResponse) connection.sendRequest(request);
            return response.isSuccess();

        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
