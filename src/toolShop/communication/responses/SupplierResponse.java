package toolShop.communication.responses;

import toolShop.models.Supplier;

public class SupplierResponse extends Response
{
    private Supplier supplier;

    public SupplierResponse(Supplier supplier)
    {
        super(220);
        this.supplier = supplier;
    }

    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
}
