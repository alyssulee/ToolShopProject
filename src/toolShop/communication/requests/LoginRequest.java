/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

import toolShop.models.UserType;

/**
 * A request to login.
 */
public class LoginRequest extends Request
{
    /**
     * The user's username.
     */
    private String username;

    /**
     * The user's password.
     */
    private String password;

    /**
     * The type of the user.
     */
    private UserType userType;

    /**
     * Creates a request to login.
     *
     * @param username The user's username.
     * @param password The user's password.
     * @param userType The type of the user.
     */
    public LoginRequest(String username, String password, UserType userType)
    {
        super(170);
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    /**
     * Gets the user's username.
     *
     * @return The user's username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Sets the user's username.
     *
     * @param username The user's username.
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * Gets the user's password.
     *
     * @return The user's password.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets the user's password.
     *
     * @param password The user's password.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * Gets the type of the user.
     *
     * @return The type of the user.
     */
    public UserType getUserType()
    {
        return userType;
    }

    /**
     * Sets the type of the user.
     *
     * @param userType The type of the user.
     */
    public void setUserType(UserType userType)
    {
        this.userType = userType;
    }
}
