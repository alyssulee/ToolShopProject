package Communication.Requests;

import Communication.Message;

public abstract class Request extends Message
{
    public Request(int discriminator)
    {
        super(discriminator);
    }
}
