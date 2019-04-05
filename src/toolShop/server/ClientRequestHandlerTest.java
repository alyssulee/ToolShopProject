package toolShop.server;

import org.junit.jupiter.api.Test;
import toolShop.OrderService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.SuccessResponse;
import toolShop.communication.responses.ToolResponse;
import toolShop.communication.responses.ToolsResponse;
import toolShop.models.Tool;
import toolShop.repositories.MemoryToolRepository;

import java.util.Optional;

class ClientRequestHandlerTest
{
    private MemoryToolRepository toolRepository = new MemoryToolRepository();
    private LinkedInventoryService inventory = new LinkedInventoryService(toolRepository);
    private OrderService orderService = new LinkedOrderService(toolRepository);
    private ClientRequestHandler handler = new ClientRequestHandler(inventory, orderService);

    @Test
    void handelAddToolRequest()
    {
        AddToolRequest request = new AddToolRequest(new Tool(0, "Hammer", 10, 15, 0));

        SuccessResponse response = handler.handelAddToolRequest(request);

        assert response.isSuccess();
        assert toolRepository.getTool(0).isPresent();
    }

    @Test
    void handelRemoveToolRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        RemoveToolRequest request = new RemoveToolRequest(0);

        SuccessResponse response = handler.handelRemoveToolRequest(request);

        assert response.isSuccess();
        assert !toolRepository.getTool(0).isPresent();
    }

    @Test
    void handelGetToolByIdRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        GetToolByIdRequest request = new GetToolByIdRequest(0);

        ToolResponse response = handler.handelGetToolByIdRequest(request);

        assert response.getTool() != null;
    }

    @Test
    void handelGetToolsWithNameRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        inventory.addTool(new Tool(1, "Hammer", 5, 30, 0));
        GetToolsWithNameRequest request = new GetToolsWithNameRequest("Hammer");

        ToolsResponse response = handler.handelGetToolsWithNameRequest(request);

        assert response.getTools().size() == 2;
    }

    @Test
    void handelGetAllToolsRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        inventory.addTool(new Tool(1, "Nails", 5, 5, 0));
        GetAllToolsRequest request = new GetAllToolsRequest();

        ToolsResponse response = handler.handelGetAllToolsRequest(request);

        assert response.getTools().size() == 2;
    }

    @Test
    void handelReduceToolQuantityRequest()
    {
        inventory.addTool(new Tool(0, "Hammer", 10, 15, 0));
        ReduceToolQuantityRequest request = new ReduceToolQuantityRequest(0, 8);

        SuccessResponse response = handler.handelReduceToolQuantityRequest(request);

        assert response.isSuccess();
        Optional<Tool> tool = inventory.getToolById(0);
        assert tool.isPresent();
        assert tool.get().getQuantity() == 2;
    }
}