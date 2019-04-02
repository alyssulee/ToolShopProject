package Repositories;

import Models.Tool;

import java.util.Optional;

public interface ToolRepository
{
    void addTool(Tool tool);

    Optional<Tool> getTool(int id);

    void updateTool(Tool tool);

    Iterable<Tool> getToolsWithName(String name);
}
