/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.repositories;

import toolShop.models.Tool;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * An in-memory tool repository.
 */
public class MemoryToolRepository implements ToolRepository
{
    /**
     * The in-memory tools.
     */
    private ArrayList<Tool> tools = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void addTool(Tool tool)
    {
        // Unlike the database, there is no protection against duplicate ids
        tools.add(tool);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeTool(Tool tool)
    {
        tools.remove(tool);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Tool> getTool(int id)
    {
        return tools.stream().filter(t -> t.getId() == id).findFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getAllTools()
    {
        return tools;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateTool(Tool tool)
    {
        // No need, updated in memory
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getToolsWithName(String name)
    {
        return tools.stream().filter(t -> t.getName().equals(name)).collect(Collectors.toList());
    }
}
