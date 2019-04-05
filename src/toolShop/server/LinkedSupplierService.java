package toolShop.server;

import toolShop.SupplierService;
import toolShop.models.Supplier;
import toolShop.repositories.SupplierRepository;

import java.util.Optional;

public class LinkedSupplierService implements SupplierService
{
    private SupplierRepository supplierRepository;

    public LinkedSupplierService(SupplierRepository supplierRepository)
    {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Optional<Supplier> getSupplierById(int supplierId)
    {
        return supplierRepository.getSupplier(supplierId);
    }
}
