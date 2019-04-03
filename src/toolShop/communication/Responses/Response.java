package toolShop.communication.responses;

import toolShop.communication.Message;

public abstract class Response extends Message
{
    Response(int discriminator)
    {
        super(discriminator);
    }
}
