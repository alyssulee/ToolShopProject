/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.requests;

/**
 * A request to get all tools.
 */
public class GetAllToolsRequest extends Request
{
    /**
     * Creates a request to get all tools.
     */
    public GetAllToolsRequest()
    {
        super(104);
    }
}
