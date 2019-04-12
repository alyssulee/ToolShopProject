/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.util.Optional;

/**
 * A database-backed tool repository.
 */
public class DatabaseToolRepository implements ToolRepository
{
    /**
     * The database.
     */
    private ToolDataTable database;

    /**
     * Creates a database-backed tool repository.
     *
     * @param db The database.
     */
    public DatabaseToolRepository(ToolDataTable db)
    {
        database = db;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addTool(Tool tool)
    {
        database.addTool(tool);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeTool(Tool tool)
    {
        database.removeTool(tool.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Tool> getTool(int id)
    {
        return database.getToolById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getAllTools()
    {
        return database.getAllTools();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Tool> getToolsWithName(String name)
    {
        return database.getToolsWithName(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateTool(Tool tool)
    {
        database.reduceToolQuantity(tool.getId(), tool.getQuantity());
    }
}
