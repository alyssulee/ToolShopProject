package Models;

public class OrderLine
{
    private int toolId;
    private int supplierId;
    private int quantity;

    public OrderLine(Tool tool, int quantity)
    {
        // Use the default tool supplier unless specified otherwise
        this(tool.getId(), tool.getSupplierId(), quantity);
    }

    public OrderLine(Tool tool, Supplier supplier, int quantity)
    {
        this(tool.getId(), supplier.getId(), quantity);
    }

    public OrderLine(int toolId, int supplierId, int quantity)
    {
        this.toolId = toolId;
        this.supplierId = supplierId;
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

    public int getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
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
