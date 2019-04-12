/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

import toolShop.models.Order;

/**
 * A request to execute an order.
 */
public class ExecuteOrderRequest extends Request
{
    /**
     * The order to execute.
     */
    private Order order;

    /**
     * Creates a request to execute an order.
     *
     * @param order The order to execute.
     */
    public ExecuteOrderRequest(Order order)
    {
        super(151);
        this.order = order;
    }

    /**
     * Gets the order to execute.
     *
     * @return The order to execute.
     */
    public Order getOrder()
    {
        return order;
    }

    /**
     * Sets the order to execute.
     *
     * @param order The order to execute.
     */
    public void setOrder(Order order)
    {
        this.order = order;
    }
}
