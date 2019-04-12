/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.InventoryService;
import toolShop.LoginService;
import toolShop.OrderService;
import toolShop.SupplierService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.*;
import toolShop.models.Order;
import toolShop.models.Supplier;
import toolShop.models.Tool;

import java.util.ArrayList;
import java.util.Optional;

/**
 * {@inheritDoc}
 */
public class ClientRequestHandler implements RequestHandler
{
    /**
     * The inventory service.
     */
    private InventoryService inventory;

    /**
     * The supplier service.
     */
    private SupplierService supplierService;

    /**
     * The order service.
     */
    private OrderService orderService;

    /**
     * The login service.
     */
    private LoginService loginService;

    /**
     * Creates a client request handler.
     *
     * @param inventory       The inventory service.
     * @param supplierService The supplier service.
     * @param orderService    The order service.
     * @param loginService    The login service.
     */
    public ClientRequestHandler(
            InventoryService inventory,
            SupplierService supplierService,
            OrderService orderService,
            LoginService loginService)
    {
        this.inventory = inventory;
        this.supplierService = supplierService;
        this.orderService = orderService;
        this.loginService = loginService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Response handleRequest(Request request)
    {
        switch (request.getDiscriminator())
        {
            case 100:
                return handleAddToolRequest((AddToolRequest) request);
            case 101:
                return handleRemoveToolRequest((RemoveToolRequest) request);
            case 102:
                return handleGetToolByIdRequest((GetToolByIdRequest) request);
            case 103:
                return handleGetToolsWithNameRequest((GetToolsWithNameRequest) request);
            case 104:
                return handleGetAllToolsRequest((GetAllToolsRequest) request);
            case 105:
                return handleReduceToolQuantityRequest((ReduceToolQuantityRequest) request);
            case 120:
                return handleGetSupplierByIdRequest((GetSupplierByIdRequest) request);
            case 150:
                return handleGetOrderRequest((GetOrderRequest) request);
            case 151:
                return handleExecuteOrderRequest((ExecuteOrderRequest) request);
            case 170:
                return handleLoginRequest((LoginRequest) request);
            case 171:
                return handleAddUserRequest((AddUserRequest) request);

            default:
                throw new Error("Received request with unknown discriminator");
        }
    }

    /**
     * Handles a request to add a tool.
     *
     * @param request The request.
     * @return The response.
     */
    public SuccessResponse handleAddToolRequest(AddToolRequest request)
    {
        boolean success = inventory.addTool(request.getTool());
        return new SuccessResponse(success);
    }

    /**
     * Handles a request to remove a tool.
     *
     * @param request The request.
     * @return The response.
     */
    public SuccessResponse handleRemoveToolRequest(RemoveToolRequest request)
    {
        boolean success = inventory.removeTool(request.getToolId());
        return new SuccessResponse(success);
    }

    /**
     * Handles a request to get a tool by id.
     *
     * @param request The request.
     * @return The response.
     */
    public ToolResponse handleGetToolByIdRequest(GetToolByIdRequest request)
    {
        Optional<Tool> optional = inventory.getToolById(request.getToolId());
        return optional.map(ToolResponse::new).orElseGet(() -> new ToolResponse(null));
    }

    /**
     * Handles a request to get tools by name.
     *
     * @param request The request.
     * @return The response.
     */
    public ToolsResponse handleGetToolsWithNameRequest(GetToolsWithNameRequest request)
    {
        Iterable<Tool> tools = inventory.getToolsWithName(request.getToolName());
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    /**
     * Handles a request to get all tools.
     *
     * @param request The request.
     * @return The response.
     */
    public ToolsResponse handleGetAllToolsRequest(GetAllToolsRequest request)
    {
        Iterable<Tool> tools = inventory.getAllTools();
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    /**
     * Handles a request to reduce a tool's quantity.
     *
     * @param request The request.
     * @return The response.
     */
    public SuccessResponse handleReduceToolQuantityRequest(ReduceToolQuantityRequest request)
    {
        boolean success = inventory.reduceToolQuantity(request.getToolId(), request.getQuantity());
        return new SuccessResponse(success);
    }

    /**
     * Handles a request to get a supplier by id.
     *
     * @param request The request.
     * @return The response.
     */
    public SupplierResponse handleGetSupplierByIdRequest(GetSupplierByIdRequest request)
    {
        Optional<Supplier> optional = supplierService.getSupplierById(request.getSupplierId());
        return optional.map(SupplierResponse::new).orElseGet(() -> new SupplierResponse(null));
    }

    /**
     * Handles a request to get the current order.
     *
     * @param request The request.
     * @return The response.
     */
    public OrderResponse handleGetOrderRequest(GetOrderRequest request)
    {
        Order order = orderService.getOrder();
        return new OrderResponse(order);
    }

    /**
     * Handles a request to execute an order.
     *
     * @param request The request.
     * @return The response.
     */
    public SuccessResponse handleExecuteOrderRequest(ExecuteOrderRequest request)
    {
        boolean success = orderService.executeOrder(request.getOrder());
        return new SuccessResponse(success);
    }

    /**
     * Handles a request to login.
     *
     * @param request The request.
     * @return The response.
     */
    public SuccessResponse handleLoginRequest(LoginRequest request)
    {
        boolean success = loginService.login(request.getUsername(), request.getPassword(), request.getUserType());
        return new SuccessResponse(success);
    }

    public SuccessResponse handleAddUserRequest(AddUserRequest request)
    {
        boolean success = loginService.addUser(request.getUser().getUsername(), request.getUser().getPassword(), request.getUser().getType());
        return new SuccessResponse(success);
    }
}
