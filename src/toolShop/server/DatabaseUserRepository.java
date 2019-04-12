/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.models.User;
import toolShop.repositories.UserRepository;

import java.util.Optional;

/**
 * A database-backed user repository.
 */
public class DatabaseUserRepository implements UserRepository
{
    /**
     * The database.
     */
    private UserDataTable database;

    /**
     * Creates a database-backed tool repository.
     *
     * @param db The database.
     */
    public DatabaseUserRepository(UserDataTable db)
    {
        database = db;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean addUser(User user)
    {
        return database.addUser(user.getUsername(), user.getPassword(), user.getType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeUser(User user)
    {
        database.removeUser(user.getUsername());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<User> getUser(String username)
    {
        return database.getUser(username);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<User> getAllUsers()
    {
        return database.getAllUsers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUser(User user)
    {
        database.updateUser(user);
    }
}
