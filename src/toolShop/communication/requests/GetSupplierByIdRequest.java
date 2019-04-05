package toolShop.communication.requests;

public class GetSupplierByIdRequest extends Request
{
    private int supplierId;

    public GetSupplierByIdRequest(int supplierId)
    {
        super(120);
        this.supplierId = supplierId;
    }

    public int getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }
}
