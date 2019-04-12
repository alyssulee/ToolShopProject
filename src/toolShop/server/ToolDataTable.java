package toolShop.server;

import toolShop.InventoryService;
import toolShop.models.Tool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Maintains data and functions pertaining to the Tools
 */
public class ToolDataTable extends DataBase implements InventoryService
{
    public ToolDataTable()
    {
        super();
        createToolTable();
        readToolsFile();
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
     * Searches for tool with a certain ID number
     *
     * @param toolID - ID number of the tool
     * @return
     */
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
     * Searches for tool(s) with a certain name
     *
     * @param toolName - The name of the tool(s)
     * @return toolList - List of tools of that name
     */
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
}
