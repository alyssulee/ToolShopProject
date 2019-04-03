package toolShop.repositories;

import toolShop.models.Supplier;

import java.util.Optional;

public interface SupplierRepository
{
    void addSupplier(Supplier supplier);

    void removeSupplier(Supplier supplier);

    Optional<Supplier> getSupplier(int id);

    Iterable<Supplier> getAllSuppliers();

    void updateSupplier(Supplier supplier);
}
