package Repositories;

import Models.Supplier;

import java.util.ArrayList;
import java.util.Optional;

public class MemorySupplierRepository implements SupplierRepository
{
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    @Override
    public void addSupplier(Supplier supplier)
    {
        // Unlike the database, there is no protection against duplicate ids
        suppliers.add(supplier);
    }

    @Override
    public Optional<Supplier> getSupplier(int id)
    {
        return suppliers.stream().filter(s -> s.getId() == id).findFirst();
    }

    @Override
    public void updateSupplier(Supplier supplier)
    {
        // No need, updated in memory
    }
}
