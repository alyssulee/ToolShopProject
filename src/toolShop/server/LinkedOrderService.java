package toolShop.server;

import toolShop.OrderService;
import toolShop.models.Order;
import toolShop.models.OrderLine;
import toolShop.models.Tool;
import toolShop.repositories.ToolRepository;

import java.util.Date;
import java.util.Optional;

@SuppressWarnings("FieldCanBeLocal")
public class LinkedOrderService implements OrderService
{
    private ToolRepository toolRepository;
    private final int MIN_TOOL_QUANTITY = 40;
    private final int REFILL_TOOL_QUANTITY = 50;

    public LinkedOrderService(ToolRepository toolRepository)
    {
        this.toolRepository = toolRepository;
    }

    @Override
    public Order getOrder()
    {
        Order order = new Order(new Date());

        for (Tool tool : toolRepository.getAllTools())
        {
            if (tool.getQuantity() < MIN_TOOL_QUANTITY)
            {
                int quantity = REFILL_TOOL_QUANTITY - tool.getQuantity();
                OrderLine line = new OrderLine(tool.getId(), tool.getSupplierId(), quantity);
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
}
