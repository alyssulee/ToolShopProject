/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.repositories;

import toolShop.models.User;

import java.util.ArrayList;
import java.util.Optional;

/**
 * An in-memory user repository.
 */
public class MemoryUserRepository implements UserRepository
{
    /**
     * The in-memory users.
     */
    private ArrayList<User> users = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean addUser(User user)
    {
        // Unlike the database, there is no protection against duplicate ids
        return users.add(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeUser(User user)
    {
        users.remove(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<User> getUser(String username)
    {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<User> getAllUsers()
    {
        return users;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUser(User user)
    {
        // No need, updated in memory
    }
}
