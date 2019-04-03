package toolShop.server;

import toolShop.InventoryService;
import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.util.Optional;

public class LinkedInventoryService implements InventoryService
{
    private ToolRepository toolRepository;

    public LinkedInventoryService(ToolRepository toolRepository)
    {
        this.toolRepository = toolRepository;
    }

    @Override
    public boolean addTool(Tool tool)
    {
        try
        {
            toolRepository.addTool(tool);
            return true;
        } catch (Exception e)
        {
            // Todo: Catch a proper exception
            return false;
        }
    }

    @Override
    public boolean removeTool(int toolId)
    {
        Optional<Tool> optional = toolRepository.getTool(toolId);
        if (!optional.isPresent()) return false;
        Tool tool = optional.get();
        toolRepository.removeTool(tool);

        return true;
    }

    @Override
    public Optional<Tool> getToolById(int toolId)
    {
        return toolRepository.getTool(toolId);
    }

    @Override
    public Iterable<Tool> getToolsWithName(String toolName)
    {
        return toolRepository.getToolsWithName(toolName);
    }

    @Override
    public Optional<Integer> getToolQuantity(int toolId)
    {
        Optional<Tool> optional = toolRepository.getTool(toolId);
        if (!optional.isPresent()) return Optional.empty();
        Tool tool = optional.get();
        return Optional.of(tool.getQuantity());
    }

    @Override
    public Iterable<Tool> getAllTools()
    {
        return toolRepository.getAllTools();
    }

    @Override
    public boolean reduceToolQuantity(int toolId, int quantity)
    {
        Optional<Tool> optional = toolRepository.getTool(toolId);
        if (!optional.isPresent()) return false;
        Tool tool = optional.get();

        int newQuantity = tool.getQuantity() - quantity;
        if (newQuantity < 0) return false;
        tool.setQuantity(newQuantity);
        toolRepository.updateTool(tool);

        return true;
    }
}
