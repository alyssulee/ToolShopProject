package toolShop.server;

import toolShop.LoginService;
import toolShop.models.User;
import toolShop.models.UserType;
import toolShop.repositories.UserRepository;

import java.util.Optional;

/**
 * A login service connected to an underlying user repository.
 */
public class LinkedLoginService implements LoginService
{
    /**
     * The user repository.
     */
    private UserRepository userRepository;

    /**
     * Creates a linked login service.
     *
     * @param userRepository The user repository.
     */
    public LinkedLoginService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean login(String username, String password, UserType userType)
    {
        Optional<User> optional = userRepository.getUser(username);
        if (!optional.isPresent()) return false;
        User user = optional.get();

        return user.getPassword().equals(password) && user.getType().equals(userType);
    }
}
