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

public class ClientRequestHandler implements RequestHandler
{
    private InventoryService inventory;
    private SupplierService supplierService;
    private OrderService orderService;
    private LoginService loginService;

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

            default:
                throw new Error("Received request with unknown discriminator");
        }
    }

    public SuccessResponse handleAddToolRequest(AddToolRequest request)
    {
        boolean success = inventory.addTool(request.getTool());
        return new SuccessResponse(success);
    }

    public SuccessResponse handleRemoveToolRequest(RemoveToolRequest request)
    {
        boolean success = inventory.removeTool(request.getToolId());
        return new SuccessResponse(success);
    }

    public ToolResponse handleGetToolByIdRequest(GetToolByIdRequest request)
    {
        Optional<Tool> optional = inventory.getToolById(request.getToolId());
        return optional.map(ToolResponse::new).orElseGet(() -> new ToolResponse(null));
    }

    public ToolsResponse handleGetToolsWithNameRequest(GetToolsWithNameRequest request)
    {
        Iterable<Tool> tools = inventory.getToolsWithName(request.getToolName());
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    public ToolsResponse handleGetAllToolsRequest(GetAllToolsRequest request)
    {
        Iterable<Tool> tools = inventory.getAllTools();
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    public SuccessResponse handleReduceToolQuantityRequest(ReduceToolQuantityRequest request)
    {
        boolean success = inventory.reduceToolQuantity(request.getToolId(), request.getQuantity());
        return new SuccessResponse(success);
    }

    public SupplierResponse handleGetSupplierByIdRequest(GetSupplierByIdRequest request)
    {
        Optional<Supplier> optional = supplierService.getSupplierById(request.getSupplierId());
        return optional.map(SupplierResponse::new).orElseGet(() -> new SupplierResponse(null));
    }

    public OrderResponse handleGetOrderRequest(GetOrderRequest getOrderRequest)
    {
        Order order = orderService.getOrder();
        return new OrderResponse(order);
    }

    public SuccessResponse handleExecuteOrderRequest(ExecuteOrderRequest executeOrderRequest)
    {
        boolean success = orderService.executeOrder(executeOrderRequest.getOrder());
        return new SuccessResponse(success);
    }

    public SuccessResponse handleLoginRequest(LoginRequest request)
    {
        boolean success = loginService.login(request.getUsername(), request.getPassword(), request.getUserType());
        return new SuccessResponse(success);
    }
}
