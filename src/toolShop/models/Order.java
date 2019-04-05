package toolShop.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * A tool resupply order.
 */
public class Order implements Serializable
{
    /**
     * The specific items that compose the order.
     */
    private HashSet<OrderLine> orderLines = new HashSet<>();

    /**
     * The order date.
     */
    private Date orderDate;

    /**
     * Creates a tool resupply order.
     *
     * @param orderDate The order date.
     */
    public Order(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    /**
     * Gets the order lines.
     *
     * @return The order lines.
     */
    public Collection<OrderLine> getOrderLines()
    {
        return orderLines;
    }

    /**
     * Gets the order date.
     *
     * @return The order date.
     */
    public Date getOrderDate()
    {
        return orderDate;
    }

    /**
     * Sets the order date.
     *
     * @param orderDate The order date.
     */
    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    /**
     * Pretty-prints the order to a string.
     *
     * @return The properly formatted order.
     */
    public String printOrder()
    {
        // Todo: This will not work because tool and supplier names must be shown, not ids

        StringBuilder order = new StringBuilder("Order Date: " + orderDate.toString());
        for (OrderLine o : orderLines)
            order.append(o).append("\n");

        return order.toString();
    }
}
