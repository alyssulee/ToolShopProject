package toolShop.communication.requests;

import toolShop.communication.Message;

public abstract class Request extends Message
{
    public Request(int discriminator)
    {
        super(discriminator);
    }
}
