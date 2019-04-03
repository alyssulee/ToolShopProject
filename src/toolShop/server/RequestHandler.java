package toolShop.server;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

public interface RequestHandler
{
    Response handelRequest(Request request);
}
