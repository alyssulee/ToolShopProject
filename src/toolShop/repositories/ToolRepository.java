package toolShop.repositories;

import toolShop.models.Tool;

import java.util.Optional;

/**
 * A tool repository.
 */
public interface ToolRepository
{
    /**
     * Adds a tool.
     *
     * @param tool The tool to add.
     */
    void addTool(Tool tool);

    /**
     * Removes a tool.
     *
     * @param tool The tool to remove.
     */
    void removeTool(Tool tool);

    /**
     * Gets a tool.
     *
     * @param id The id of the tool.
     * @return The tool.
     */
    Optional<Tool> getTool(int id);

    /**
     * Gets all tools.
     *
     * @return All tools.
     */
    Iterable<Tool> getAllTools();

    /**
     * Updates a tool.
     *
     * @param tool The tool to update.
     */
    void updateTool(Tool tool);

    /**
     * Gets the tool(s) with the supplied name.
     *
     * @param name The name of the tool(s).
     * @return The tool(s).
     */
    Iterable<Tool> getToolsWithName(String name);
}
