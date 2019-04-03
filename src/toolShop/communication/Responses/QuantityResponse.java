package toolShop.communication.Responses;

public class QuantityResponse extends Response
{
    private int quantity;

    public QuantityResponse(int quantity)
    {
        super(203);
        this.quantity = quantity;
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
