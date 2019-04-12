/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.SupplierService;
import toolShop.models.Supplier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Maintains data and functions pertaining to the Suppliers
 */
public class SupplierDataTable extends DataBase implements SupplierService
{
    /**
     * Constructs a SupplierDataTable object by connecting to database and creating a new table.
     */
    public SupplierDataTable()
    {
        super();
        createSupplierTable();
        readSuppliersFile();
    }

    /**
     * Creates empty supplier table in database if table has yet to be created.
     */
    private void createSupplierTable()
    {
        try
        {
            DatabaseMetaData meta = connect.getMetaData();
            ResultSet rs = meta.getTables(null, null, "supplier", null);
            if (rs.next() == false)
            {
                String query = "CREATE TABLE supplier (supplierID INTEGER not NULL, supplierName VARCHAR(255), supplierAddress VARCHAR(255), "
                        + "supplierContactName VARCHAR(255), PRIMARY KEY (supplierID))";
                statement.executeUpdate(query);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Could not create table");
        }
    }

    /**
     * A list of suppliers are read from an input text file and inserted in the database if the table is empty.
     */
    private void readSuppliersFile()
    {
        boolean bool = false;
        try
        {
            resultSet = statement.executeQuery("select * from supplier");
            bool = resultSet.next();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        if (bool == false)
        {
            try
            {
                FileReader fr = new FileReader("suppliers.txt");
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null)
                {
                    String[] temp = line.split(";");
                    insertSupplier(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]);
                }
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Inserts a supplier into the supplier table in the database
     *
     * @param id          - Supplier ID
     * @param name        - Supplier Name
     * @param address     - Supplier Address
     * @param contactName - Supplier Contact Name
     */
    public void insertSupplier(int id, String name, String address, String contactName)
    {
        try
        {
            String query = "INSERT INTO supplier (supplierID, supplierName, supplierAddress, supplierContactName)"
                    + "values(?, ?, ?, ?)";
            PreparedStatement pState = connect.prepareStatement(query);
            pState.setInt(1, id);
            pState.setString(2, name);
            pState.setString(3, address);
            pState.setString(4, contactName);
            pState.executeUpdate();
            System.out.println("Supplier added successfully");
            pState.close();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Removes a supplier matching the given supplierID
     */
    public boolean removeSupplier(int id)
    {
        String query = "DELETE FROM supplier WHERE supplierID = " + id;
        try
        {
            statement.executeUpdate(query);
            System.out.println("Successfully deleted");
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Returns a Supplier matching the supplier ID
     *
     * @param supplierId The supplier id.
     * @return
     */
    @Override
    public Optional<Supplier> getSupplierById(int supplierId)
    {
        Supplier supplier = null;
        try
        {
            resultSet = statement.executeQuery("Select * from supplier WHERE supplierID = " + "\"" + supplierId + "\"");
            if (resultSet.next())
            {
                int id = resultSet.getInt("supplierID");
                String name = resultSet.getString("supplierName");
                String address = resultSet.getString("supplierAddress");
                String contact = resultSet.getString("supplierContactName");
                supplier = new Supplier(id, name, address, contact);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Optional.ofNullable(supplier);
    }


    /**
     * Returns an ArrayList of all Suppliers in the database
     *
     * @return - ArrayList of suppliers
     */
    public ArrayList<Supplier> getAllSuppliers()
    {
        ArrayList<Supplier> toolList = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery("select * from tool");
            while (resultSet.next())
            {
                int id = resultSet.getInt("supplierID");
                String name = resultSet.getString("supplierName");
                String address = resultSet.getString("supplierAddress");
                String contact = resultSet.getString("supplierContactName");
                resultSet.getRow();
                toolList.add(new Supplier(id, name, address, contact));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return toolList;
    }

    /**
     * Updates the information of a supplier matching the given ID
     *
     * @param supplier
     * @return
     */
    public boolean updateSupplier(Supplier supplier)
    {
        try
        {
            String query = "UPDATE supplier SET supplierName = ?, supplierAddress = ?, supplierContactName = ?"
                    + " WHERE supplierID = ?";
            PreparedStatement pState = connect.prepareStatement(query);
            pState.setString(1, supplier.getCompanyName());
            pState.setString(2, supplier.getAddress());
            pState.setString(3, supplier.getSalesContact());
            pState.setInt(4, supplier.getId());

            pState.executeUpdate();
            pState.close();
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
/*
    public static void main(String [] args)
    {
        SupplierDataTable database = new SupplierDataTable();
        System.out.println(database.updateSupplier(new Supplier(8001, "asdf", "adf", "adf")));

    }*/
}
