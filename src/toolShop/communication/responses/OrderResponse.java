package toolShop.communication.responses;

import toolShop.models.Order;

public class OrderResponse extends Response
{
    private Order order;

    public OrderResponse(Order order)
    {
        super(250);
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
