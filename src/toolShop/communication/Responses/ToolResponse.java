package toolShop.communication.Responses;

import toolShop.models.Tool;

public class ToolResponse extends Response
{
    private Tool tool;

    public ToolResponse(Tool tool)
    {
        super(201);
        this.tool = tool;
    }

    public Tool getTool()
    {
        return tool;
    }

    public void setTool(Tool tool)
    {
        this.tool = tool;
    }
}
