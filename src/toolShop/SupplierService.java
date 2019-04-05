package toolShop;

import toolShop.models.Supplier;

import java.util.Optional;

public interface SupplierService
{
    Optional<Supplier> getSupplierById(int supplierId);
}
