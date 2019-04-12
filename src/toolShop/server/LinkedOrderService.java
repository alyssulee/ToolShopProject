/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */


package toolShop.server;

import toolShop.OrderService;
import toolShop.models.Order;
import toolShop.models.OrderLine;
import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Optional;

/**
 * An order service connected to an underlying tool repository.
 */
@SuppressWarnings("FieldCanBeLocal")
public class LinkedOrderService implements OrderService
{
    /**
     * The minimum quantity below which a tool will be resupplied.
     */
    private final int MIN_TOOL_QUANTITY = 40;

    /**
     * The quantity to which tools are resupplied to.
     */
    private final int REFILL_TOOL_QUANTITY = 50;

    /**
     * A random number generator.
     */
    private SecureRandom random = new SecureRandom();

    /**
     * The tool repository.
     */
    private ToolRepository toolRepository;

    /**
     * Creates a linked order service.
     *
     * @param toolRepository The tool repository.
     */
    public LinkedOrderService(ToolRepository toolRepository)
    {
        this.toolRepository = toolRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order getOrder()
    {
        Order order = new Order(randomFiveDigitNumber(), new Date());

        for (Tool tool : toolRepository.getAllTools())
        {
            if (tool.getQuantity() < MIN_TOOL_QUANTITY)
            {
                int quantity = REFILL_TOOL_QUANTITY - tool.getQuantity();
                OrderLine line = new OrderLine(tool, quantity);
                order.getOrderLines().add(line);
            }
        }

        return order;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean executeOrder(Order order)
    {
        for (OrderLine line : order.getOrderLines())
        {
            Optional<Tool> optional = toolRepository.getTool(line.getToolId());
            if (!optional.isPresent()) return false;
            Tool tool = optional.get();

            int quantity = tool.getQuantity() + line.getQuantity();
            tool.setQuantity(quantity);
            toolRepository.updateTool(tool);
        }

        return true;
    }

    /**
     * Generates a random five digit number.
     *
     * @return A random five digit number.
     */
    private int randomFiveDigitNumber()
    {
        return random.nextInt(100000);
    }
}
