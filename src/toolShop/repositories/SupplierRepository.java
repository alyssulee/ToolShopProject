/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.repositories;

import toolShop.models.Supplier;

import java.util.Optional;

/**
 * A supplier repository.
 */
public interface SupplierRepository
{
    /**
     * Adds a supplier.
     *
     * @param supplier The suppler to add.
     */
    void addSupplier(Supplier supplier);

    /**
     * Removes a supplier.
     *
     * @param supplier The supplier to remove.
     */
    void removeSupplier(Supplier supplier);

    /**
     * Gets a supplier.
     *
     * @param id The id of the supplier.
     * @return The supplier.
     */
    Optional<Supplier> getSupplier(int id);

    /**
     * Gets all suppliers.
     *
     * @return All suppliers.
     */
    Iterable<Supplier> getAllSuppliers();

    /**
     * Updates a supplier.
     *
     * @param supplier The supplier to update.
     */
    void updateSupplier(Supplier supplier);
}
