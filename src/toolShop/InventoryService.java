/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop;

import toolShop.models.Tool;

import java.util.Optional;

/**
 * A service through which tools are accessed.
 */
public interface InventoryService
{
    /**
     * Adds the supplied tool.
     *
     * @param tool The tool to add.
     * @return An indication of success.
     */
    boolean addTool(Tool tool);

    /**
     * Removes a tool.
     *
     * @param toolId The tool id.
     * @return An indication of success.
     */
    boolean removeTool(int toolId);

    /**
     * Gets a tool by id.
     *
     * @param toolId The id of the tool.
     * @return The tool.
     */
    Optional<Tool> getToolById(int toolId);

    /**
     * Gets the tool(s) with the supplied name.
     *
     * @param toolName The name of the tool(s).
     * @return The tool(s).
     */
    Iterable<Tool> getToolsWithName(String toolName);

    /**
     * Gets all tools.
     *
     * @return The tools.
     */
    Iterable<Tool> getAllTools();

    /**
     * Reduce the quantity of a tool.
     *
     * @param toolId   The tool id.
     * @param quantity The quantity to reduce by.
     * @return An indication of success.
     */
    boolean reduceToolQuantity(int toolId, int quantity);
}
