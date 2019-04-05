package toolShop.server;

import toolShop.InventoryService;
import toolShop.OrderService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.*;
import toolShop.models.Order;
import toolShop.models.Tool;

import java.util.ArrayList;
import java.util.Optional;

public class ClientRequestHandler implements RequestHandler
{
    private InventoryService inventory;
    private OrderService orderService;

    public ClientRequestHandler(InventoryService inventory, OrderService orderService)
    {
        this.inventory = inventory;
        this.orderService = orderService;
    }

    @Override
    public Response handelRequest(Request request)
    {
        switch (request.getDiscriminator())
        {
            case 100:
                return handelAddToolRequest((AddToolRequest) request);
            case 101:
                return handelRemoveToolRequest((RemoveToolRequest) request);
            case 102:
                return handelGetToolByIdRequest((GetToolByIdRequest) request);
            case 103:
                return handelGetToolsWithNameRequest((GetToolsWithNameRequest) request);
            case 104:
                return handelGetAllToolsRequest((GetAllToolsRequest) request);
            case 105:
                return handelReduceToolQuantityRequest((ReduceToolQuantityRequest) request);
            case 150:
                return handelGetOrderRequest((GetOrderRequest) request);
            case 151:
                return handelExecuteOrderRequest((ExecuteOrderRequest) request);
            default:
                throw new Error("Received request with unknown discriminator");
        }
    }

    public SuccessResponse handelAddToolRequest(AddToolRequest request)
    {
        boolean success = inventory.addTool(request.getTool());
        return new SuccessResponse(success);
    }

    public SuccessResponse handelRemoveToolRequest(RemoveToolRequest request)
    {
        boolean success = inventory.removeTool(request.getToolId());
        return new SuccessResponse(success);
    }

    public ToolResponse handelGetToolByIdRequest(GetToolByIdRequest request)
    {
        Optional<Tool> optional = inventory.getToolById(request.getToolId());
        return optional.map(ToolResponse::new).orElseGet(() -> new ToolResponse(null));
    }

    public ToolsResponse handelGetToolsWithNameRequest(GetToolsWithNameRequest request)
    {
        Iterable<Tool> tools = inventory.getToolsWithName(request.getToolName());
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    public ToolsResponse handelGetAllToolsRequest(GetAllToolsRequest request)
    {
        Iterable<Tool> tools = inventory.getAllTools();
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    public SuccessResponse handelReduceToolQuantityRequest(ReduceToolQuantityRequest request)
    {
        boolean success = inventory.reduceToolQuantity(request.getToolId(), request.getQuantity());
        return new SuccessResponse(success);
    }

    public OrderResponse handelGetOrderRequest(GetOrderRequest getOrderRequest)
    {
        Order order = orderService.getOrder();
        return new OrderResponse(order);
    }

    public SuccessResponse handelExecuteOrderRequest(ExecuteOrderRequest executeOrderRequest)
    {
        boolean success = orderService.executeOrder(executeOrderRequest.getOrder());
        return new SuccessResponse(success);
    }
}
