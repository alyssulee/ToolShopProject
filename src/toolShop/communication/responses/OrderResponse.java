/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.responses;

import toolShop.models.Order;

/**
 * A response containing an order.
 */
public class OrderResponse extends Response
{
    /**
     * The order.
     */
    private Order order;

    /**
     * Creates a response containing an order.
     *
     * @param order The order.
     */
    public OrderResponse(Order order)
    {
        super(250);
        this.order = order;
    }

    /**
     * Gets the order.
     *
     * @return The order.
     */
    public Order getOrder()
    {
        return order;
    }

    /**
     * Sets the order.
     *
     * @param order The order.
     */
    public void setOrder(Order order)
    {
        this.order = order;
    }
}
