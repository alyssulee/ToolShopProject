/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.client;

import toolShop.SupplierService;
import toolShop.communication.requests.GetSupplierByIdRequest;
import toolShop.communication.responses.SupplierResponse;
import toolShop.models.Supplier;

import java.io.IOException;
import java.util.Optional;

/**
 * A supplier service connected to the server,
 */
public class ServerSupplierService implements SupplierService
{
    /**
     * The server connection.
     */
    private ServerConnection connection;

    /**
     * Creates a server supplier service.
     *
     * @param connection The server connection.
     */
    public ServerSupplierService(ServerConnection connection)
    {
        this.connection = connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Supplier> getSupplierById(int supplierId)
    {
        try
        {
            GetSupplierByIdRequest request = new GetSupplierByIdRequest(supplierId);
            SupplierResponse response = (SupplierResponse) connection.sendRequest(request);
            return Optional.ofNullable(response.getSupplier());

        } catch (IOException e)
        {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
