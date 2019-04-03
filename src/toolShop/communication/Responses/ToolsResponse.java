package toolShop.communication.Responses;

import toolShop.models.Tool;

import java.util.ArrayList;

public class ToolsResponse extends Response
{
    private ArrayList<Tool> tools;

    public ToolsResponse(ArrayList<Tool> tools)
    {
        super(202);
        this.tools = tools;
    }

    public ArrayList<Tool> getTools()
    {
        return tools;
    }

    public void setTools(ArrayList<Tool> tools)
    {
        this.tools = tools;
    }
}
