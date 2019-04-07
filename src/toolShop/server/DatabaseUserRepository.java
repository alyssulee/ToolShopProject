package toolShop.server;

import toolShop.models.User;
import toolShop.repositories.UserRepository;

import java.util.Optional;

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

    @Override
    public void addUser(User user)
    {
        database.insertUser(user.getUsername(), user.getPassword(), user.getType().toString());
    }

    @Override
    public void removeUser(User user)
    {
        database.removeUser(user.getUsername());
    }

    @Override
    public Optional<User> getUser(String username)
    {
        return database.getUser(username);
    }

    @Override
    public Iterable<User> getAllUsers()
    {
        return database.getAllUsers();
    }

    @Override
    public void updateUser(User user)
    {
        database.updateUser(user);
    }
}
