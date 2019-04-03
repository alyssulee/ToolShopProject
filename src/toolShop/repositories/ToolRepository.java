package toolShop.repositories;

import toolShop.models.Tool;

import java.util.Optional;

public interface ToolRepository
{
    void addTool(Tool tool);

    void removeTool(Tool tool);

    Optional<Tool> getTool(int id);

    Iterable<Tool> getAllTools();

    void updateTool(Tool tool);

    Iterable<Tool> getToolsWithName(String name);
}
