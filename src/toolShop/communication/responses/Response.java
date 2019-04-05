package toolShop.communication.responses;

import toolShop.communication.Message;

/**
 * An abstract type from which all responses inherit.
 */
public abstract class Response extends Message
{
    /**
     * Creates a response with the supplied discriminator.
     *
     * @param discriminator The discriminator used to identity the response type.
     */
    Response(int discriminator)
    {
        super(discriminator);
    }
}
