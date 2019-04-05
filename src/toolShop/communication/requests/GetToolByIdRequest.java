package toolShop.communication.requests;

/**
 * A request to get a tool by id.
 */
public class GetToolByIdRequest extends Request
{
    /**
     * The tool id.
     */
    private int toolId;

    /**
     * Creates a request to get a tool by id.
     *
     * @param toolId The tool id.
     */
    public GetToolByIdRequest(int toolId)
    {
        super(102);
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
     * @param toolId The tool td.
     */
    public void setToolId(int toolId)
    {
        this.toolId = toolId;
    }
}
