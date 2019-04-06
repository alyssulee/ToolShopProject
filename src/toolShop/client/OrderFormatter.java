package toolShop.client;

import toolShop.models.Order;

/**
 * Formats an order to a string.
 */
public interface OrderFormatter
{
    /**
     * Formats an order to a string.
     *
     * @param order The order.
     * @return The formatted order string.
     */
    String formatOrder(Order order);
}
