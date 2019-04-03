package toolShop.server;

import toolShop.communication.Requests.Request;
import toolShop.communication.Responses.Response;

public interface RequestHandler
{
    Response handelRequest(Request request);
}
