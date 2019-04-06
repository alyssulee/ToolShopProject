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
     * The order id.
     */
    private int id;

    /**
     * The order date.
     */
    private Date orderDate;

    /**
     * Creates a tool resupply order.
     *
     * @param orderDate The order date.
     */
    public Order(int id, Date orderDate)
    {
        this.id = id;
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
     * Gets the order id.
     *
     * @return The order id.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the order id.
     *
     * @param id The order id.
     */
    public void setId(int id)
    {
        this.id = id;
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
}
