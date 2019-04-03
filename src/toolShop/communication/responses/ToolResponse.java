package toolShop.communication.responses;

import com.sun.istack.internal.Nullable;
import toolShop.models.Tool;

public class ToolResponse extends Response
{
    @Nullable
    private Tool tool;

    public ToolResponse(@Nullable Tool tool)
    {
        super(201);
        this.tool = tool;
    }

    @Nullable
    public Tool getTool()
    {
        return tool;
    }

    public void setTool(@Nullable Tool tool)
    {
        this.tool = tool;
    }
}
