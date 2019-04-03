package toolShop.communication;

import java.io.Serializable;

public abstract class Message implements Serializable
{
    private int discriminator;

    public Message(int discriminator)
    {
        this.discriminator = discriminator;
    }

    public int getDiscriminator()
    {
        return discriminator;
    }
}
