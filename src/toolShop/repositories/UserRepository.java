package toolShop.repositories;

import toolShop.models.User;

import java.util.Optional;

public interface UserRepository
{
    void addUser(User user);

    void removeUser(User user);

    Optional<User> getUser(String username);

    Iterable<User> getAllUsers();

    void updateUser(User user);
}
