package toolShop.communication.requests;

/**
 * A request to remove a tool.
 */
public class RemoveToolRequest extends Request
{
    /**
     * The tool id.
     */
    private int toolId;

    /**
     * Creates a request to remove a tool.
     *
     * @param toolId The tool id.
     */
    public RemoveToolRequest(int toolId)
    {
        super(101);
        this.toolId = toolId;
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
}
