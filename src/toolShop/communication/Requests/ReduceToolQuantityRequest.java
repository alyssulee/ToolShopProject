package toolShop.communication.Requests;

public class ReduceToolQuantityRequest extends Request
{
    private int toolId;
    private int quantity;

    public ReduceToolQuantityRequest(int toolId, int quantity)
    {
        super(106);
        this.toolId = toolId;
        this.quantity = quantity;
    }

    public int getToolId()
    {
        return toolId;
    }

    public void setToolId(int toolId)
    {
        this.toolId = toolId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
