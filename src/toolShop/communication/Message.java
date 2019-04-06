package toolShop.communication;

import java.io.Serializable;

/**
 * An abstract message type.
 */
public abstract class Message implements Serializable
{
    /**
     * The discriminator used to identify the message type.
     */
    private int discriminator;

    /**
     * Creates a new message.
     *
     * @param discriminator The discriminator used to identify the message type.
     */
    public Message(int discriminator)
    {
        this.discriminator = discriminator;
    }

    /**
     * Gets the discriminator used to identify the message type.
     * @return The discriminator used to identify the message type.
     */
    public int getDiscriminator()
    {
        return discriminator;
    }
}
