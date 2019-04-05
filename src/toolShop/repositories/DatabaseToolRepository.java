package toolShop.repositories;

import toolShop.models.Tool;

import java.util.Optional;

public class DatabaseToolRepository implements ToolRepository
{
    private DataBase database;

    public DatabaseToolRepository(DataBase db)
    {
        database = db;
    }

    @Override
    public void addTool(Tool tool)
    {
        database.addTool(tool);
    }

    @Override
    public void removeTool(Tool tool)
    {
        database.removeTool(tool.getId());
    }

    @Override
    public Optional<Tool> getTool(int id)
    {
        return database.getToolById(id);
    }

    @Override
    public Iterable<Tool> getAllTools()
    {
        return database.getAllTools();
    }

    @Override
    public Iterable<Tool> getToolsWithName(String name)
    {
        return database.getToolsWithName(name);
    }

    @Override
    public void updateTool(Tool tool)
    {
        database.reduceToolQuantity(tool.getId(), tool.getQuantity());
    }

}
