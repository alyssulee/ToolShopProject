package toolShop.communication.requests;

import toolShop.models.Tool;

/**
 * A request to add a tool.
 */
public class AddToolRequest extends Request
{
    /**
     * The tool to add.
     */
    private Tool tool;

    /**
     * Creates a request to add a tool.
     *
     * @param tool The tool to add.
     */
    public AddToolRequest(Tool tool)
    {
        super(100);
        this.tool = tool;
    }

    /**
     * Gets the tool to add.
     *
     * @return The tool to add.
     */
    public Tool getTool()
    {
        return tool;
    }

    /**
     * Sets the tool to add.
     *
     * @param tool The tool to add.
     */
    public void setTool(Tool tool)
    {
        this.tool = tool;
    }
}
