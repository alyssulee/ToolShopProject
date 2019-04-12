/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.LoginService;
import toolShop.models.User;
import toolShop.models.UserType;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Maintains data and functions pertaining to the Suppliers
 */
public class UserDataTable extends DataBase implements LoginService
{
    private final UserType customer = UserType.Customer;
    private final UserType owner = UserType.Owner;

    public UserDataTable()
    {
        super();
        createUserTable();
    }

    /**
     * Creates empty user table in database if table has yet to be created.
     */
    private void createUserTable()
    {
        try
        {
            DatabaseMetaData meta = connect.getMetaData();
            ResultSet rs = meta.getTables(null, null, "shopusers", null);


            if (rs.next() == false)
            {
                String query = "CREATE TABLE shopusers (username VARCHAR(255) not NULL, password VARCHAR(255), userType VARCHAR(255),"
                        + " PRIMARY KEY (username))";
                statement.executeUpdate(query);

                addUser("admin", "password", owner);
                addUser("admin1", "password", owner);
                addUser("user1", "user1", customer);
                addUser("user2", "user2", customer);
                System.out.println("User Table created");
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Could not create table");
        }
    }

    /**
     * Inserts a user into the tool table in the database
     *
     * @param username The username.
     * @param password The password.
     * @param userType The user type.
     * @return
     */
    public boolean addUser(String username, String password, UserType userType)
    {
        try
        {
            String query = "INSERT INTO shopusers (username, password, userType)"
                    + "values(?, ?, ?)";
            PreparedStatement pState = connect.prepareStatement(query);
            pState.setString(1, username);
            pState.setString(2, password);
            pState.setString(3, userType.toString());
            pState.executeUpdate();
            System.out.println("User added successfully");
            pState.close();
            return true;
        } catch (SQLIntegrityConstraintViolationException e)
        {
            System.out.println("Entry of the same username has already been added!");
            return false;
        } catch (SQLException e1)
        {
            e1.printStackTrace();
            return false;
        }
    }

    /**
     * Removes the user from data table
     *
     * @param username - username of the user
     * @return
     */
    public boolean removeUser(String username)
    {
        String query = "DELETE FROM shopusers WHERE username = \"" + username + "\"";
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
     * Searches for user of a given username
     */
    public Optional<User> getUser(String username)
    {
        User user = null;
        try
        {
            resultSet = statement.executeQuery("Select * from shopusers WHERE username = " + "\"" + username + "\"");
            while (resultSet.next())
            {
                String password = resultSet.getString("password");
                String type = resultSet.getString("userType");
                UserType userType = UserType.valueOf(type);
                user = new User(username, password, userType);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Optional.ofNullable(user);
    }

    /**
     * Returns an ArrayList of all tools in the database
     *
     * @return - ArrayList of tools
     */
    public ArrayList<User> getAllUsers()
    {
        ArrayList<User> toolList = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery("select * from tool");
            while (resultSet.next())
            {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String type = resultSet.getString("userType");
                UserType userType = UserType.valueOf(type);
                toolList.add(new User(username, password, userType));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return toolList;
    }


    /**
     * Updates the information of a user matching the given username
     *
     * @param user
     * @return
     */
    public boolean updateUser(User user)
    {
        try
        {
            String query = "UPDATE shopusers SET username = ?, password = ?, userType = ?"
                    + " WHERE supplierID = ?";
            PreparedStatement pState = connect.prepareStatement(query);
            pState.setString(1, user.getPassword());
            pState.setString(2, user.getType().toString());
            pState.setString(3, user.getUsername());

            pState.executeUpdate();
            pState.close();
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean login(String username, String password, UserType userType)
    {
        try
        {
            resultSet = statement.executeQuery("Select * from shopusers WHERE username = " + "\"" + username + "\"");
            if (resultSet.next())
            {
                if (resultSet.getString("password").equals(password))
                    return true;
                else
                {
                    System.out.println("Incorrect Password!");
                }
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
