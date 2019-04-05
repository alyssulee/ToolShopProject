package toolShop.repositories;

import toolShop.models.Supplier;

import java.util.ArrayList;
import java.util.Optional;

/**
 * An in-memory supplier repository.
 */
public class MemorySupplierRepository implements SupplierRepository
{
    /**
     * The in-memory suppliers.
     */
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void addSupplier(Supplier supplier)
    {
        // Unlike the database, there is no protection against duplicate ids
        suppliers.add(supplier);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeSupplier(Supplier supplier)
    {
        suppliers.remove(supplier);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Supplier> getSupplier(int id)
    {
        return suppliers.stream().filter(s -> s.getId() == id).findFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Supplier> getAllSuppliers()
    {
        return suppliers;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateSupplier(Supplier supplier)
    {
        // No need, updated in memory
    }
}
