package toolShop.server;

import toolShop.InventoryService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.Response;
import toolShop.communication.responses.SuccessResponse;
import toolShop.communication.responses.ToolResponse;
import toolShop.communication.responses.ToolsResponse;
import toolShop.models.Tool;

import java.util.ArrayList;
import java.util.Optional;

public class ClientRequestHandler implements RequestHandler
{
    private InventoryService inventory;

    public ClientRequestHandler(InventoryService inventory)
    {
        this.inventory = inventory;
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
            default:
                throw new Error("Received request with unknown discriminator");
        }
    }

    private SuccessResponse handelAddToolRequest(AddToolRequest request)
    {
        boolean success = inventory.addTool(request.getTool());
        return new SuccessResponse(success);
    }

    private SuccessResponse handelRemoveToolRequest(RemoveToolRequest request)
    {
        boolean success = inventory.removeTool(request.getToolId());
        return new SuccessResponse(success);
    }

    private ToolResponse handelGetToolByIdRequest(GetToolByIdRequest request)
    {
        Optional<Tool> optional = inventory.getToolById(request.getToolId());
        return optional.map(ToolResponse::new).orElseGet(() -> new ToolResponse(null));
    }

    private ToolsResponse handelGetToolsWithNameRequest(GetToolsWithNameRequest request)
    {
        Iterable<Tool> tools = inventory.getToolsWithName(request.getToolName());
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    private ToolsResponse handelGetAllToolsRequest(GetAllToolsRequest request)
    {
        Iterable<Tool> tools = inventory.getAllTools();
        ArrayList<Tool> collected = new ArrayList<>();
        tools.forEach(collected::add);
        return new ToolsResponse(collected);
    }

    private SuccessResponse handelReduceToolQuantityRequest(ReduceToolQuantityRequest request)
    {
        boolean success = inventory.reduceToolQuantity(request.getToolId(), request.getQuantity());
        return new SuccessResponse(success);
    }
}
