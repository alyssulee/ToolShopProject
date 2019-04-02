package Communication.Requests;

public class GetToolsWithNameRequest extends Request
{
    private String toolName;

    public GetToolsWithNameRequest(String toolName)
    {
        super(103);
        this.toolName = toolName;
    }

    public String getToolName()
    {
        return toolName;
    }

    public void setToolName(String toolName)
    {
        this.toolName = toolName;
    }
}
