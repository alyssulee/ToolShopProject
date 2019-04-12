/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop;

import toolShop.models.Order;

/**
 * A service though which orders are proposed and executed.
 */
public interface OrderService
{
    /**
     * Gets the current order.
     *
     * @return The current order.
     */
    Order getOrder();

    /**
     * Executes the supplied order.
     *
     * @param order The order.
     * @return An indication of success.
     */
    boolean executeOrder(Order order);
}
