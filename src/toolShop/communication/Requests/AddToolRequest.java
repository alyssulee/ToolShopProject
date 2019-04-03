package toolShop.communication.requests;

import toolShop.models.Tool;

public class AddToolRequest extends Request
{
    private Tool tool;

    public AddToolRequest(Tool tool)
    {
        super(100);
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
