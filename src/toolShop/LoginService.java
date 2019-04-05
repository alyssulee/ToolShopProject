package toolShop;

import toolShop.models.UserType;

public interface LoginService
{
    boolean login(String username, String password, UserType userType);
}
