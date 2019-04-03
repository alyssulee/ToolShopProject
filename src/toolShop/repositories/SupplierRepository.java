package toolShop.repositories;

import toolShop.models.Supplier;

import java.util.Optional;

public interface SupplierRepository
{
    void addSupplier(Supplier supplier);

    Optional<Supplier> getSupplier(int id);

    void updateSupplier(Supplier supplier);
}
