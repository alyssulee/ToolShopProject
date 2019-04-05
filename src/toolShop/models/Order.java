package toolShop.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Order implements Serializable
{
    private HashSet<OrderLine> orderLines = new HashSet<>();
    private Date orderDate;
    private int orderNum;

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

    public String printOrder()
    {
        String order = "Order Date: " + orderDate.toString();


        return order;
    }
}
