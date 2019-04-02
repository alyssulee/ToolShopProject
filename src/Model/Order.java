package Model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Order
{
    private HashSet<OrderLine> orderLines = new HashSet<>();
    private Date orderDate;

    public Order(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public Collection<OrderLine> getOrderLines()
    {
        return orderLines;
    }

    public Date getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }
}
