package toolShop.server;

import toolShop.OrderService;
import toolShop.models.Order;
import toolShop.models.OrderLine;
import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Optional;

@SuppressWarnings("FieldCanBeLocal")
public class LinkedOrderService implements OrderService
{
    private final int MIN_TOOL_QUANTITY = 40;
    private final int REFILL_TOOL_QUANTITY = 50;
    private SecureRandom random = new SecureRandom();
    private ToolRepository toolRepository;

    public LinkedOrderService(ToolRepository toolRepository)
    {
        this.toolRepository = toolRepository;
    }

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

    private int randomFiveDigitNumber()
    {
        return random.nextInt(100000);
    }
}
