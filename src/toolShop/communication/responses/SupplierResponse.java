/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.responses;

import com.sun.istack.internal.Nullable;
import toolShop.models.Supplier;

/**
 * A response containing a supplier.
 */
public class SupplierResponse extends Response
{
    /**
     * The supplier; may be null.
     */
    @Nullable
    private Supplier supplier;

    /**
     * Creates a response containing a supplier.
     *
     * @param supplier The supplier; may be null.
     */
    public SupplierResponse(@Nullable Supplier supplier)
    {
        super(220);
        this.supplier = supplier;
    }

    /**
     * Gets the supplier; may be null.
     *
     * @return The supplier; may be null.
     */
    @Nullable
    public Supplier getSupplier()
    {
        return supplier;
    }

    /**
     * Sets the supplier.
     *
     * @param supplier The supplier; may be null.
     */
    public void setSupplier(@Nullable Supplier supplier)
    {
        this.supplier = supplier;
    }
}
