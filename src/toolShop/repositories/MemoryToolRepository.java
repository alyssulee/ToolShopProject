package toolShop.repositories;

import toolShop.models.Tool;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemoryToolRepository implements ToolRepository
{
    private ArrayList<Tool> tools = new ArrayList<>();

    @Override
    public void addTool(Tool tool)
    {
        // Unlike the database, there is no protection against duplicate ids
        tools.add(tool);
    }

    @Override
    public void removeTool(Tool tool)
    {
        tools.remove(tool);
    }

    @Override
    public Optional<Tool> getTool(int id)
    {
        return tools.stream().filter(t -> t.getId() == id).findFirst();
    }

    @Override
    public Iterable<Tool> getAllTools()
    {
        return tools;
    }

    @Override
    public void updateTool(Tool tool)
    {
        // No need, updated in memory
    }

    @Override
    public Iterable<Tool> getToolsWithName(String name)
    {
        return tools.stream().filter(t -> t.getName().equals(name)).collect(Collectors.toList());
    }
}
