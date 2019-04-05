package toolShop.repositories;

import toolShop.models.User;

import java.util.ArrayList;
import java.util.Optional;

public class MemoryUserRepository implements UserRepository
{
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void addUser(User user)
    {
        // Unlike the database, there is no protection against duplicate ids
        users.add(user);
    }

    @Override
    public void removeUser(User user)
    {
        users.remove(user);
    }

    @Override
    public Optional<User> getUser(String username)
    {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }

    @Override
    public Iterable<User> getAllUsers()
    {
        return users;
    }

    @Override
    public void updateUser(User user)
    {
        // No need, updated in memory
    }
}
