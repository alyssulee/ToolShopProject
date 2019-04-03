package toolShop.client;

import toolShop.InventoryService;
import toolShop.communication.requests.*;
import toolShop.communication.responses.*;
import toolShop.models.Tool;

import java.io.IOException;
import java.util.*;

public class ServerInventoryService implements InventoryService
{
    private ServerConnection connection;

    public ServerInventoryService(ServerConnection connection)
    {
        this.connection = connection;
    }

    @Override
    public boolean addTool(Tool tool)
    {
        try
        {
            AddToolRequest request = new AddToolRequest(tool);
            SuccessResponse response = (SuccessResponse) connection.sendRequest(request);
            return response.isSuccess();

        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeTool(int toolId)
    {
        try
        {
            RemoveToolRequest request = new RemoveToolRequest(toolId);
            SuccessResponse response = (SuccessResponse) connection.sendRequest(request);
            return response.isSuccess();

        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Optional<Tool> getToolById(int toolId)
    {
        try
        {
            GetToolByIdRequest request = new GetToolByIdRequest(toolId);
            ToolResponse response = (ToolResponse) connection.sendRequest(request);
            return Optional.ofNullable(response.getTool());

        } catch (IOException e)
        {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Iterable<Tool> getToolsWithName(String toolName)
    {
        try
        {
            GetToolsWithNameRequest request = new GetToolsWithNameRequest(toolName);
            ToolsResponse response = (ToolsResponse) connection.sendRequest(request);
            return response.getTools();

        } catch (IOException e)
        {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }

    @Override
    public Iterable<Tool> getAllTools()
    {
        try
        {
            GetAllToolsRequest request = new GetAllToolsRequest();
            ToolsResponse response = (ToolsResponse) connection.sendRequest(request);
            return response.getTools();

        } catch (IOException e)
        {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }

    @Override
    public boolean reduceToolQuantity(int toolId, int quantity)
    {
        try
        {
            ReduceToolQuantityRequest request = new ReduceToolQuantityRequest(toolId, quantity);
            SuccessResponse response = (SuccessResponse) connection.sendRequest(request);
            return response.isSuccess();

        } catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
