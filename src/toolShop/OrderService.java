package toolShop;

import toolShop.models.Order;

public interface OrderService
{
    Order getOrder();

    boolean executeOrder(Order order);
}
