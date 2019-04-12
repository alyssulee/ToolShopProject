/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

/**
 * A request to get all tools with the supplied name.
 */
public class GetToolsWithNameRequest extends Request
{
    /**
     * The name of the tool(s).
     */
    private String toolName;

    /**
     * Creates a request to get all tools with the supplied name.
     *
     * @param toolName The name of the tool(s).
     */
    public GetToolsWithNameRequest(String toolName)
    {
        super(103);
        this.toolName = toolName;
    }

    /**
     * Gets the name of the tool(s).
     *
     * @return The name of the tool(s).
     */
    public String getToolName()
    {
        return toolName;
    }

    /**
     * Sets the name of the tool(s).
     *
     * @param toolName The name of the tool(s).
     */
    public void setToolName(String toolName)
    {
        this.toolName = toolName;
    }
}
