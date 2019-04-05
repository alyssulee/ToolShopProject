package toolShop.models;

import java.io.Serializable;

public class User implements Serializable
{
    // Username acts as primary key
    private String username;
    private String password;
    private UserType type;

    public User(String username, String password, UserType type)
    {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public UserType getType()
    {
        return type;
    }

    public void setType(UserType type)
    {
        this.type = type;
    }
}