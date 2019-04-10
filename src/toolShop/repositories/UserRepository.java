package toolShop.repositories;

import toolShop.models.User;

import java.util.Optional;

/**
 * A user repository.
 */
public interface UserRepository
{
    /**
     * Adds a user.
     *
     * @param user The user to add.
     */
    boolean addUser(User user);

    /**
     * Removes a user.
     *
     * @param user The user to remove.
     */
    void removeUser(User user);

    /**
     * Gets a user.
     *
     * @param username The user's username.
     * @return The user.
     */
    Optional<User> getUser(String username);

    /**
     * Gets all users.
     *
     * @return All users.
     */
    Iterable<User> getAllUsers();

    /**
     * Updates a user.
     *
     * @param user The user to update.
     */
    void updateUser(User user);
}
