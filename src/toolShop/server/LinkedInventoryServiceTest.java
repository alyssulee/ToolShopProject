package toolShop.server;

import toolShop.models.Tool;
import toolShop.repositories.MemoryToolRepository;

import java.util.Optional;
import java.util.stream.StreamSupport;

/**
 * Tests for LinkedInventoryServiceTest.
 */
class LinkedInventoryServiceTest
{
    /**
     * The tool repository.
     */
    private MemoryToolRepository toolRepository = new MemoryToolRepository();

    /**
     * The inventory.
     */
    private LinkedInventoryService inventory = new LinkedInventoryService(toolRepository);

    /**
     * Tests the addTool method.
     */
    @org.junit.jupiter.api.Test
    void addTool()
    {
        Tool tool = new Tool(0, "Chainsaw", 10, 150, 0);

        inventory.addTool(tool);

        assert toolRepository.getTool(0).isPresent();
    }

    /**
     * Tests the removeTool method.
     */
    @org.junit.jupiter.api.Test
    void removeTool()
    {
        Tool tool = new Tool(0, "Chainsaw", 10, 150, 0);
        toolRepository.addTool(tool);

        inventory.removeTool(0);

        assert !toolRepository.getTool(0).isPresent();
    }

    /**
     * Tests the getToolById method.
     */
    @org.junit.jupiter.api.Test
    void getToolById()
    {
        Tool tool = new Tool(0, "Chainsaw", 10, 150, 0);
        toolRepository.addTool(tool);

        Optional<Tool> optional = inventory.getToolById(0);

        assert optional.isPresent();
        assert optional.get().equals(tool);
    }

    /**
     * Tests the getToolsWithName method.
     */
    @org.junit.jupiter.api.Test
    void getToolsWithName()
    {
        toolRepository.addTool(new Tool(0, "Nails", 10, 5, 0));
        toolRepository.addTool(new Tool(1, "Nails", 15, 3, 0));
        toolRepository.addTool(new Tool(2, "Axe", 20, 15, 0));

        Iterable<Tool> tools = inventory.getToolsWithName("Nails");

        assert StreamSupport.stream(tools.spliterator(), false).anyMatch(tool -> tool.getId() == 0);
        assert StreamSupport.stream(tools.spliterator(), false).anyMatch(tool -> tool.getId() == 1);
        assert StreamSupport.stream(tools.spliterator(), false).noneMatch(tool -> tool.getId() == 2);
    }

    /**
     * Tests the getAllTools method.
     */
    @org.junit.jupiter.api.Test
    void getAllTools()
    {
        toolRepository.addTool(new Tool(0, "Nails", 10, 5, 0));
        toolRepository.addTool(new Tool(1, "Nails", 15, 3, 0));
        toolRepository.addTool(new Tool(2, "Axe", 20, 15, 0));

        Iterable<Tool> tools = inventory.getAllTools();

        assert StreamSupport.stream(tools.spliterator(), false).anyMatch(tool -> tool.getId() == 0);
        assert StreamSupport.stream(tools.spliterator(), false).anyMatch(tool -> tool.getId() == 1);
        assert StreamSupport.stream(tools.spliterator(), false).anyMatch(tool -> tool.getId() == 2);
    }

    /**
     * Tests the reduceToolQuantity method.
     */
    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @org.junit.jupiter.api.Test
    void reduceToolQuantity()
    {
        Tool tool = new Tool(0, "Explosive", 5, 2500, 0);
        toolRepository.addTool(tool);

        boolean success = inventory.reduceToolQuantity(0, 3);
        assert success;
        assert toolRepository.getTool(0).get().getQuantity() == 2;

        success = inventory.reduceToolQuantity(0, 3);
        assert !success;
        assert toolRepository.getTool(0).get().getQuantity() == 2;
    }
}