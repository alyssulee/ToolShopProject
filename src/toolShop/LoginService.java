/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop;

import toolShop.models.UserType;

/**
 * A service though which logins are attempted.
 */
public interface LoginService
{
    /**
     * Attempts a login.
     *
     * @param username The username.
     * @param password The password.
     * @param userType The user type.
     * @return An indication of success.
     */
    boolean login(String username, String password, UserType userType);

    /**
     * Adds the supplied user.
     *
     * @param username The username.
     * @param password The password.
     * @param userType The user type.
     * @return An indication of success.
     */
    boolean addUser(String username, String password, UserType userType);
}
