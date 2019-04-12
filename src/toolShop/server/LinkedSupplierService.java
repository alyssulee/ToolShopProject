/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.SupplierService;
import toolShop.models.Supplier;
import toolShop.repositories.SupplierRepository;

import java.util.Optional;

/**
 * A supplier service connected to an underlying supplier repository.
 */
public class LinkedSupplierService implements SupplierService
{
    /**
     * The supplier repository.
     */
    private SupplierRepository supplierRepository;

    /**
     * Creates a linked supplier service.
     *
     * @param supplierRepository The supplier repository.
     */
    public LinkedSupplierService(SupplierRepository supplierRepository)
    {
        this.supplierRepository = supplierRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Supplier> getSupplierById(int supplierId)
    {
        return supplierRepository.getSupplier(supplierId);
    }
}
