package toolShop.server;

import java.sql.*;

/**
 * Database containing information pertaining to a shop's suppliers and tools.
 */
abstract public class DataBase
{
    /**
     * Used to establish a connection to the database
     */
    protected Connection connect;
    /**
     * Represents table of data in the database
     */
    protected ResultSet resultSet;
    /**
     * Represents a SQL statement and used to execute queries
     */
    protected Statement statement;

    public DataBase()
    {
        initializeConnection("newuser", "password");
    }

    /**
     * Connects to the database
     */
    private void initializeConnection(String username, String password)
    {
        try
        {
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/toolshop" +
                            "?useUnicode=true" +
                            "&useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatetimeCode=false" +
                            "&serverTimezone=UTC",
                    username,
                    password);
            statement = connect.createStatement();

        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Connection not established");
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
}
