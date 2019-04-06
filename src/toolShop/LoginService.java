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
}
