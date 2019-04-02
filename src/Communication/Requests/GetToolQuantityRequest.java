package Communication.Requests;

public class GetToolQuantityRequest extends Request
{
    private int toolId;

    public GetToolQuantityRequest(int toolId)
    {
        super(104);
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
