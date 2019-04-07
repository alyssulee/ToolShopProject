package toolShop.server;

import toolShop.models.Supplier;
import toolShop.repositories.SupplierRepository;

import java.util.Optional;

public class DatabaseSupplierRepository implements SupplierRepository
{
    /**
     * The database.
     */
    private SupplierDataTable database;

    /**
     * Creates a database-backed tool repository.
     *
     * @param db The database.
     */
    public DatabaseSupplierRepository(SupplierDataTable db)
    {
        database = db;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addSupplier(Supplier supplier)
    {
        database.insertSupplier(supplier.getId(), supplier.getCompanyName(), supplier.getAddress(), supplier.getSalesContact());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeSupplier(Supplier supplier)
    {
        database.removeSupplier(supplier.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Supplier> getSupplier(int id)
    {
        return database.getSupplierById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Supplier> getAllSuppliers()
    {
        return database.getAllSuppliers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateSupplier(Supplier supplier)
    {
        database.updateSupplier(supplier);
    }
}
