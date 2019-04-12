/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.communication.responses;

import toolShop.models.Tool;

import java.util.ArrayList;

/**
 * A response containing tools.
 */
public class ToolsResponse extends Response
{
    /**
     * The tools.
     */
    private ArrayList<Tool> tools;

    /**
     * Creates a response containing tools.
     *
     * @param tools The tools.
     */
    public ToolsResponse(ArrayList<Tool> tools)
    {
        super(202);
        this.tools = tools;
    }

    /**
     * Gets the tools.
     *
     * @return The tools.
     */
    public ArrayList<Tool> getTools()
    {
        return tools;
    }

    /**
     * Sets the tools.
     *
     * @param tools The tools.
     */
    public void setTools(ArrayList<Tool> tools)
    {
        this.tools = tools;
    }
}
