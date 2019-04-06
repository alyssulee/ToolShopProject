package toolShop.server;

import toolShop.InventoryService;
import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.util.Optional;

/**
 * An inventory service connected to an underlying tool repository.
 */
public class LinkedInventoryService implements InventoryService
{
    /**
     * The tool repository.
     */
    private ToolRepository toolRepository;

    /**
     * Creates a linked inventory service.
     *
     * @param toolRepository The tool repository.
     */
    public LinkedInventoryService(ToolRepository toolRepository)
    {
        this.toolRepository = toolRepository;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeTool(int toolId)
    {
        Optional<Tool> optional = toolRepository.getTool(toolId);
        if (!optional.isPresent()) return false;
        Tool tool = optional.get();
        toolRepository.removeTool(tool);

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Tool> getToolById(int toolId)
    {
        return toolRepository.getTool(toolId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getToolsWithName(String toolName)
    {
        return toolRepository.getToolsWithName(toolName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getAllTools()
    {
        return toolRepository.getAllTools();
    }

    /**
     * {@inheritDoc}
     */
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
