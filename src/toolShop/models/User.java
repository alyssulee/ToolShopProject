/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.models;

import java.io.Serializable;

/**
 * A tool shop user.
 */
public class User implements Serializable
{
    /**
     * The username.
     */
    // Username acts as primary key
    private String username;

    /**
     * The password.
     */
    private String password;

    /**
     * The user type.
     */
    private UserType type;

    /**
     * Creates a tool shop user.
     *
     * @param username The username.
     * @param password The password.
     * @param type     The user type.
     */
    public User(String username, String password, UserType type)
    {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    /**
     * Gets the username.
     *
     * @return The username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username The username.
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return The password.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password The password.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * Gets the user type.
     *
     * @return The user type.
     */
    public UserType getType()
    {
        return type;
    }

    /**
     * Sets the user type.
     *
     * @param type The user type.
     */
    public void setType(UserType type)
    {
        this.type = type;
    }
}