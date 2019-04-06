package toolShop.server;

import toolShop.communication.requests.Request;
import toolShop.communication.responses.Response;

/**
 * A request handler.
 */
public interface RequestHandler
{
    /**
     * Handles the supplied request and generates an appropriate response.
     *
     * @param request The request.
     * @return The response.
     */
    Response handleRequest(Request request);
}
