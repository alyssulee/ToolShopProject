package toolShop.client;

import toolShop.SupplierService;
import toolShop.communication.requests.GetSupplierByIdRequest;
import toolShop.communication.responses.SupplierResponse;
import toolShop.models.Supplier;

import java.io.IOException;
import java.util.Optional;

public class ServerSupplierService implements SupplierService
{
    private ServerConnection connection;

    public ServerSupplierService(ServerConnection connection)
    {
        this.connection = connection;
    }

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
