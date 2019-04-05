package toolShop.communication.responses;

import com.sun.istack.internal.Nullable;
import toolShop.models.Tool;

/**
 * A response containing a tool.
 */
public class ToolResponse extends Response
{
    /**
     * The tool; may be null.
     */
    @Nullable
    private Tool tool;

    /**
     * Creates a response containing a tool.
     *
     * @param tool The tool; may be null.
     */
    public ToolResponse(@Nullable Tool tool)
    {
        super(201);
        this.tool = tool;
    }

    /**
     * Gets the tool; may be null.
     *
     * @return The tool; may be null.
     */
    @Nullable
    public Tool getTool()
    {
        return tool;
    }

    /**
     * Sets the tool.
     *
     * @param tool The tool; may be null.
     */
    public void setTool(@Nullable Tool tool)
    {
        this.tool = tool;
    }
}
