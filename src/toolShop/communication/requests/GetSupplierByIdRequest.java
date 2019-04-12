/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

/**
 * A request to get a supplier by id.
 */
public class GetSupplierByIdRequest extends Request
{
    /**
     * The supplier id.
     */
    private int supplierId;

    /**
     * Creates a request to get a supplier by id.
     *
     * @param supplierId The supplier id.
     */
    public GetSupplierByIdRequest(int supplierId)
    {
        super(120);
        this.supplierId = supplierId;
    }

    /**
     * Gets the supplier id.
     *
     * @return The supplier id.
     */
    public int getSupplierId()
    {
        return supplierId;
    }

    /**
     * Sets the supplier id.
     *
     * @param supplierId The supplier id.
     */
    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }
}
