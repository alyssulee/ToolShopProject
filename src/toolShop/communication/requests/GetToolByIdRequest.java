package toolShop.communication.Requests;

public class GetToolByIdRequest extends Request
{
    private int toolId;

    public GetToolByIdRequest(int toolId)
    {
        super(102);
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
