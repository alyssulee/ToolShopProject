package toolShop.server;

import toolShop.LoginService;
import toolShop.models.User;
import toolShop.models.UserType;
import toolShop.repositories.UserRepository;

import java.util.Optional;

public class LinkedLoginService implements LoginService
{
    private UserRepository userRepository;

    public LinkedLoginService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public boolean login(String username, String password, UserType userType)
    {
        Optional<User> optional = userRepository.getUser(username);
        if (!optional.isPresent()) return false;
        User user = optional.get();

        return user.getPassword().equals(password) && user.getType().equals(userType);
    }
}
