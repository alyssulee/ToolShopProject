package toolShop.communication.responses;

public class SuccessResponse extends Response
{
    private boolean success;

    public SuccessResponse(boolean success)
    {
        super(200);
        this.success = success;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }
}
