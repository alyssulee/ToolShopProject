package toolShop.communication.requests;

import toolShop.models.Order;

public class ExecuteOrderRequest extends Request
{
    private Order order;

    public ExecuteOrderRequest(Order order)
    {
        super(151);
        this.order = order;
    }

    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }
}
