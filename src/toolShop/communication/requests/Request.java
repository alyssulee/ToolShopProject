package toolShop.communication.requests;

import toolShop.communication.Message;

/**
 * An abstract type from which all requests inherit.
 */
public abstract class Request extends Message
{
    /**
     * Creates a request with the supplied discriminator.
     *
     * @param discriminator The discriminator used to identify the request type.
     */
    public Request(int discriminator)
    {
        super(discriminator);
    }
}
