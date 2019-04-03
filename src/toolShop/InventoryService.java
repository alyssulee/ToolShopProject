package toolShop;

import toolShop.models.Tool;

import java.util.Optional;

public interface InventoryService
{
    boolean addTool(Tool tool);

    boolean removeTool(int toolId);

    Optional<Tool> getToolById(int toolId);

    Iterable<Tool> getToolsWithName(String toolName);

    Iterable<Tool> getAllTools();

    boolean reduceToolQuantity(int toolId, int quantity);
}
