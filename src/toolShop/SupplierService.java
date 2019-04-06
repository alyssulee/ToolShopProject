package toolShop;

import toolShop.models.Supplier;

import java.util.Optional;

/**
 * A service though which suppliers are accessed.
 */
public interface SupplierService
{
    /**
     * Gets a supplier by id.
     *
     * @param supplierId The supplier id.
     * @return The supplier.
     */
    Optional<Supplier> getSupplierById(int supplierId);
}
