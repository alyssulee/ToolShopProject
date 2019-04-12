/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import org.junit.jupiter.api.Test;
import toolShop.InventoryService;
import toolShop.LoginService;
import toolShop.OrderService;
import toolShop.SupplierService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.SuccessResponse;
import toolShop.communication.responses.SupplierResponse;
import toolShop.communication.responses.ToolResponse;
import toolShop.communication.responses.ToolsResponse;
import toolShop.models.Supplier;
import toolShop.models.Tool;
import toolShop.repositories.*;

import java.util.Optional;

/**
 * Tests for ClientRequestHandler.
 */
class ClientRequestHandlerTest
{
    /**
     * The tool repository.
     */
    private ToolRepository toolRepository = new MemoryToolRepository();

    /**
     * The supplier repository.
     */
    private SupplierRepository supplierRepository = new MemorySupplierRepository();

    /**
     * The user repository.
     */
    private UserRepository userRepository = new MemoryUserRepository();

    /**
     * The inventory.
     */
    private InventoryService inventory = new LinkedInventoryService(toolRepository);

    /**
     * The supplier service.
     */
    private SupplierService supplierService = new LinkedSupplierService(supplierRepository);

    /**
     * The order service.
     */
    private OrderService orderService = new LinkedOrderService(toolRepository);

    /**
     * The login service.
     */
    private LoginService loginService = new LinkedLoginService(userRepository);

    /**
     * The client request handler to test.
     */
    private ClientRequestHandler handler = new ClientRequestHandler(
            inventory,
            supplierService,
            orderService,
            loginService);

    /**
     * Tests the handleAddToolRequest method.
     */
    @Test
    void handleAddToolRequest()
    {
        AddToolRequest request = new AddToolRequest(new Tool(0, "Hammer", 10, 15, 0));

        SuccessResponse response = handler.handleAddToolRequest(request);

        assert response.isSuccess();
        assert toolRepository.getTool(0).isPresent();
    }

    /**
     * Tests the handleRemoveToolRequest method.
     */
    @Test
    void handleRemoveToolRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        RemoveToolRequest request = new RemoveToolRequest(0);

        SuccessResponse response = handler.handleRemoveToolRequest(request);

        assert response.isSuccess();
        assert !toolRepository.getTool(0).isPresent();
    }

    /**
     * Tests the handleGetToolByIdRequest method.
     */
    @Test
    void handleGetToolByIdRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        GetToolByIdRequest request = new GetToolByIdRequest(0);

        ToolResponse response = handler.handleGetToolByIdRequest(request);

        assert response.getTool() != null;
    }

    /**
     * Tests the handleGetToolsWithNameRequest method.
     */
    @Test
    void handleGetToolsWithNameRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        inventory.addTool(new Tool(1, "Hammer", 5, 30, 0));
        GetToolsWithNameRequest request = new GetToolsWithNameRequest("Hammer");

        ToolsResponse response = handler.handleGetToolsWithNameRequest(request);

        assert response.getTools().size() == 2;
    }

    /**
     * Tests the handleGetAllToolsRequest method.
     */
    @Test
    void handleGetAllToolsRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        inventory.addTool(new Tool(1, "Nails", 5, 5, 0));
        GetAllToolsRequest request = new GetAllToolsRequest();

        ToolsResponse response = handler.handleGetAllToolsRequest(request);

        assert response.getTools().size() == 2;
    }

    /**
     * Tests the handleReduceToolQuantityRequest method.
     */
    @Test
    void handleReduceToolQuantityRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        ReduceToolQuantityRequest request = new ReduceToolQuantityRequest(0, 8);

        SuccessResponse response = handler.handleReduceToolQuantityRequest(request);

        assert response.isSuccess();
        Optional<Tool> tool = inventory.getToolById(0);
        assert tool.isPresent();
        assert tool.get().getQuantity() == 2;
    }

    /**
     * Tests the handleGetSupplierByIdRequest method.
     */
    @Test
    void handleGetSupplierByIdRequest()
    {
        Supplier supplier = new Supplier(0, "Bark's", "Main St.", "bark@barks.co");
        supplierRepository.addSupplier(supplier);
        GetSupplierByIdRequest request = new GetSupplierByIdRequest(0);

        SupplierResponse response = handler.handleGetSupplierByIdRequest(request);

        assert response.getSupplier() != null;
    }
}