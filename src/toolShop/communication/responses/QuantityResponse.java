package toolShop.communication.responses;

import com.sun.istack.internal.Nullable;

public class QuantityResponse extends Response
{
    @Nullable
    private Integer quantity;

    public QuantityResponse(@Nullable Integer quantity)
    {
        super(203);
        this.quantity = quantity;
    }

    @Nullable
    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(@Nullable Integer quantity)
    {
        this.quantity = quantity;
    }
}
