package toolShop.communication.requests;

import toolShop.models.User;

/**
 * Request to add user
 */
public class AddUserRequest extends Request
{
    /**
     * The user to add.
     */
    private User user;

    /**
     * Creates a request to add a user.
     *
     * @param user The user to add.
     */
    public AddUserRequest(User user)
    {
        super(171);
        this.user = user;
    }

    /**
     * Gets the user to add.
     *
     * @return The user to add.
     */
    public User getUser()
    {
        return user;
    }

    /**
     * Sets the user to add.
     *
     * @param user The user to add.
     */
    public void setUser(User user)
    {
        this.user = user;
    }

}
