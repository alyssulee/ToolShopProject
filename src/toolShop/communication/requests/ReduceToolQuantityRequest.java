/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

/**
 * A request to reduce the quantity of a tool.
 */
public class ReduceToolQuantityRequest extends Request
{
    /**
     * The tool id.
     */
    private int toolId;

    /**
     * The quantity to reduce by.
     */
    private int quantity;

    /**
     * Creates a request to reduce the quantity of a tool.
     *
     * @param toolId   The tool id.
     * @param quantity The quantity to reduce by.
     */
    public ReduceToolQuantityRequest(int toolId, int quantity)
    {
        super(105);
        this.toolId = toolId;
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
     * Gets the quantity to reduce by,
     *
     * @return The quantity to reduce by.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity to reduce by.
     *
     * @param quantity The quantity to reduce by.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
