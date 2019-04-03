package toolShop.communication.requests;

public class RemoveToolRequest extends Request
{
    private int toolId;

    public RemoveToolRequest(int toolId)
    {
        super(101);
        this.toolId = toolId;
    }

    public int getToolId()
    {
        return toolId;
    }

    public void setToolId(int toolId)
    {
        this.toolId = toolId;
    }
}
