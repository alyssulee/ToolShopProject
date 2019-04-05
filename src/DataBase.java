import toolShop.InventoryService;
import toolShop.models.Tool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Database containing information pertaining to a shop's suppliers and tools.
 */
public class DataBase implements InventoryService
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
    private final String customer = "Customer";
    private final String owner = "Shop Owner";

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
            System.out.println("Connection not established");
        }
    }

    /**
     * Sets the quantity of a tool in the database
     *
     * @param id          - Tool ID
     * @param newQuantity - New tool quantity
     */
    public boolean reduceToolQuantity(int id, int newQuantity)
    {
        try
        {
            String query = "UPDATE tool" + " SET toolQuantity = " + newQuantity + " WHERE toolID = " + id;
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * Receives a tool ID and removes the tool from the database
     *
     * @param id - Tool ID
     */
    public boolean removeTool(int id)
    {
        String query = "DELETE FROM tool WHERE toolID = " + id;
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
     * Inserts a tool into the tool table in the database
     *
     * @param tool - Tool to be added to database
     */
    public boolean addTool(Tool tool)
    {
        try
        {
            String query = "INSERT INTO tool (toolID, toolName, toolQuantity, toolPrice, supplierID)"
                    + " values(?, ?, ?, ?, ?)";

            PreparedStatement pState = connect.prepareStatement(query);
            pState.setInt(1, tool.getId());
            pState.setString(2, tool.getName());
            pState.setInt(3, tool.getQuantity());
            pState.setDouble(4, tool.getPrice());
            pState.setInt(5, tool.getSupplierId());
            pState.executeUpdate();
            System.out.println("Tool added successfully");
            pState.close();
            return true;
        } catch (SQLIntegrityConstraintViolationException e)
        {
            System.out.println("Entry of the same ID has already been added!");
            return false;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
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
     * Returns an ArrayList of all tools in the database
     *
     * @return - ArrayList of tools
     */
    public ArrayList<Tool> getAllTools()
    {
        ArrayList<Tool> toolList = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery("select * from tool");
            while (resultSet.next())
            {
                int id = resultSet.getInt("toolID");
                String name = resultSet.getString("toolName");
                int quantity = resultSet.getInt("toolQuantity");
                int price = resultSet.getInt("toolPrice");
                int supplierID = resultSet.getInt("supplierID");
                resultSet.getRow();
                toolList.add(new Tool(id, name, quantity, price, supplierID));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return toolList;
    }

    public ArrayList<Tool> getToolsWithName(String toolName)
    {
        ArrayList<Tool> toolList = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery("Select * from tool WHERE toolName = " + "\"" + toolName + "\"");
            while (resultSet.next())
            {
                int id = resultSet.getInt("toolID");
                String name = resultSet.getString("toolName");
                int quantity = resultSet.getInt("toolQuantity");
                int price = resultSet.getInt("toolPrice");
                int supplierID = resultSet.getInt("supplierID");
                //resultSet.getRow();
                toolList.add(new Tool(id, name, quantity, price, supplierID));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return toolList;
    }

    public Optional<Tool> getToolById(int toolID)
    {
        Tool tool = null;
        try
        {
            resultSet = statement.executeQuery("Select * from tool WHERE toolID = " + "\"" + toolID + "\"");
            if (resultSet.next())
            {
                int id = resultSet.getInt("toolID");
                String name = resultSet.getString("toolName");
                int quantity = resultSet.getInt("toolQuantity");
                int price = resultSet.getInt("toolPrice");
                int supplierID = resultSet.getInt("supplierID");
                tool = new Tool(id, name, quantity, price, supplierID);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Optional.ofNullable(tool);
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
                    addTool(new Tool(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4])));
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

    private void createUsersTable()
    {
        try
        {
            DatabaseMetaData meta = connect.getMetaData();
            ResultSet rs = meta.getTables(null, null, "user", null);
            if (rs.next() == false)
            {
                String query = "CREATE TABLE tool (username VARCHAR(255) not NULL, password VARCHAR(255) not NULL, userType VARCHAR(255)"
                        + " PRIMARY KEY (username))";
                statement.executeUpdate(query);
                insertUser("admin", "password", owner);
                insertUser("user1", "user1", customer);
                insertUser("user2", "user2", customer);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Could not create table");
        }
    }

    private void insertUser(String username, String password, String userType)
    {
        try
        {
            String query = "INSERT INTO user (username, password, userType)"
                    + "values(?, ?)";
            PreparedStatement pState = connect.prepareStatement(query);
            pState.setString(1, username);
            pState.setString(2, password);
            pState.setString(3, userType);
            pState.executeUpdate();
            System.out.println("User added successfully");
            pState.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
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
        //dataBase.addTool(new Tool(1, "Barn Bins", 1, 2, 3));
        //dataBase.removeTool(1);
        //dataBase.close();
/*        ArrayList<Tool> list = dataBase.getAllTools();
        for (Tool t : list)
        {
            System.out.println(t);
        }*/
/*
        ArrayList<Tool> toolList = dataBase.getToolsWithName("Barn Bins");
        for(Tool t : toolList)
        {
            System.out.println(t);
        }
*/

/*        Optional<Tool> tool = dataBase.getToolById(1);
        System.out.println(tool);*/
    }
}
