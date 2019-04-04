import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

/**
 * Database containing information pertaining to a shop's suppliers and tools.
 */
public class DataBase
{

    /**
     * Used to establish a connection to the database
     */
    private Connection connect;
    /**
     * Represents table of data in the database
     */
    private ResultSet resultSet;
    /**
     * Represents a SQL statement and used to execute queries
     */
    private Statement statement;

    /**
     * Connects to the database
     */
    private void initializeConnection(String username, String password)
    {
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/toolshop", username, password);
            statement = connect.createStatement();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Sets the quantity of a tool in the database
     *
     * @param id          - Tool ID
     * @param newQuantity - New tool quantity
     */
    public void changeToolQuantity(int id, int newQuantity)
    {
        try
        {
            String query = "UPDATE tool" + " SET toolQuantity = " + newQuantity + " WHERE toolID = " + id;
            statement.executeUpdate(query);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Receives a tool ID and removes the tool from the database
     *
     * @param id - Tool ID
     */
    public void deleteTool(int id)
    {
        String query = "DELETE FROM tool WHERE toolID = " + id;
        try
        {
            statement.executeUpdate(query);
            System.out.println("Successfully deleted");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Inserts a tool into the tool table in the database
     *
     * @param id         - Tool ID
     * @param name       - Tool Name
     * @param quantity   - Tool Quantity
     * @param price      - Tool Price
     * @param supplierID - ID of the Supplier supplying the specified tool
     */
    public void insertTool(int id, String name, int quantity, double price, int supplierID)
    {
        try
        {
            String query = "INSERT INTO tool (toolID, toolName, toolQuantity, toolPrice, supplierID)"
                    + " values(?, ?, ?, ?, ?)";

            PreparedStatement pState = connect.prepareStatement(query);
            pState.setInt(1, id);
            pState.setString(2, name);
            pState.setInt(3, quantity);
            pState.setDouble(4, price);
            pState.setInt(5, supplierID);
            pState.executeUpdate();
            System.out.println("Tool added successfully");
            pState.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
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
     * Disconnects from database
     */
    public void close()
    {
        try
        {
            statement.close();
            resultSet.close();
            connect.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * A list of tools are read from an input text file and inserted in the database if the table is empty.
     */
    private void readToolsFile()
    {
        boolean bool = false;
        try
        {
            resultSet = statement.executeQuery("select * from tool");
            bool = resultSet.next();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        if (bool == false)
        {
            try
            {
                FileReader fr = new FileReader("items.txt");
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null)
                {
                    String[] temp = line.split(";");
                    insertTool(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]));
                }
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
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
     * Creates empty tool table in database if table has yet to be created.
     */
    private void createToolTable()
    {
        try
        {
            DatabaseMetaData meta = connect.getMetaData();
            ResultSet rs = meta.getTables(null, null, "tool", null);
            if (rs.next() == false)
            {
                String query = "CREATE TABLE tool (toolID INTEGER not NULL, toolName VARCHAR(255), toolQuantity INTEGER, "
                        + "toolPrice DOUBLE, supplierID INTEGER not NULL, PRIMARY KEY (toolID))";
                statement.executeUpdate(query);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Could not create table");
        }
    }

    /**
     * Creates empty supplier table in database if table has yet to be created.
     */
    private void createSupplierTables()
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

    public static void main(String[] args)
    {
        DataBase dataBase = new DataBase();
        dataBase.initializeConnection("newuser", "password");

        dataBase.createToolTable();
        dataBase.createSupplierTables();

        dataBase.readToolsFile();
        dataBase.readSuppliersFile();
        //dataBase.insertTool(1, "the", 1, 2, 3);
        //dataBase.deleteTool(1);
    }
}
