/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.models;

import java.io.Serializable;

/**
 * An order line representing a single item in an order.
 */
public class OrderLine implements Serializable
{
    /**
     * The tool id.
     */
    private int toolId;

    /**
     * The supplier id.
     */
    private int supplierId;

    /**
     * The quantity to order.
     */
    private int quantity;

    /**
     * Creates an order line.
     *
     * @param tool     The tool to resupply.
     * @param quantity The quantity to order.
     */
    public OrderLine(Tool tool, int quantity)
    {
        // Use the default tool supplier unless specified otherwise
        this(tool.getId(), tool.getSupplierId(), quantity);
    }

    /**
     * Creates an order line.
     *
     * @param tool     The tool to resupply.
     * @param supplier The supplier to order from.
     * @param quantity The quantity to order.
     */
    public OrderLine(Tool tool, Supplier supplier, int quantity)
    {
        this(tool.getId(), supplier.getId(), quantity);
    }

    /**
     * Creates an order line.
     *
     * @param toolId     The id of the tool to resupply.
     * @param supplierId The id of the supplier to order from.
     * @param quantity   The quantity to order.
     */
    public OrderLine(int toolId, int supplierId, int quantity)
    {
        this.toolId = toolId;
        this.supplierId = supplierId;
        this.quantity = quantity;
    }

    /**
     * Gets the tool id.
     *
     * @return The tool id.
     */
    public int getToolId()
    {
        return toolId;
    }

    /**
     * Sets the tool id.
     *
     * @param toolId The tool id.
     */
    public void setToolId(int toolId)
    {
        this.toolId = toolId;
    }

    /**
     * Gets the supplier id.
     *
     * @return The supplier id.
     */
    public int getSupplierId()
    {
        return supplierId;
    }

    /**
     * Sets the supplier id.
     *
     * @param supplierId The supplier id.
     */
    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }

    /**
     * Gets the order quantity.
     *
     * @return The order quantity.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the order quantity.
     *
     * @param quantity The order quantity.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
