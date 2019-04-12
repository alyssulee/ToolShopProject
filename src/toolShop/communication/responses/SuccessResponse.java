/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.responses;

/**
 * A response indicating success or failure.
 */
public class SuccessResponse extends Response
{
    /**
     * The success indication.
     */
    private boolean success;

    /**
     * Creates a response indicating success or failure.
     *
     * @param success The success indication.
     */
    public SuccessResponse(boolean success)
    {
        super(200);
        this.success = success;
    }

    /**
     * Gets the success indication; true if success.
     *
     * @return The success indication; true if success.
     */
    public boolean isSuccess()
    {
        return success;
    }

    /**
     * Sets the success indication.
     *
     * @param success The success indication.
     */
    public void setSuccess(boolean success)
    {
        this.success = success;
    }
}
