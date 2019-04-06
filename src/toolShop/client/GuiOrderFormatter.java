package toolShop.client;

import toolShop.InventoryService;
import toolShop.SupplierService;
import toolShop.models.Order;
import toolShop.models.OrderLine;
import toolShop.models.Supplier;
import toolShop.models.Tool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class GuiOrderFormatter implements OrderFormatter
{
    private InventoryService inventory;
    private SupplierService supplierService;

    public GuiOrderFormatter(InventoryService inventory, SupplierService supplierService)
    {
        this.inventory = inventory;
        this.supplierService = supplierService;
    }

    @Override
    public String formatOrder(Order order)
    {
        StringBuilder builder = new StringBuilder();

        builder.append("ORDER ID:\t\t").append(order.getId()).append("\n");
        builder.append("Date Ordered:\t\t").append(formatDate(order.getOrderDate()));

        for (OrderLine line : order.getOrderLines())
        {
            builder.append("\n").append("\n");
            builder.append(formatOrderLine(line));
        }

        return builder.toString();
    }

    private String formatDate(Date date)
    {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        return dateFormat.format(date);
    }

    public String formatOrderLine(OrderLine line)
    {
        Optional<Tool> tool = inventory.getToolById(line.getToolId());
        if (!tool.isPresent())
        {
            System.err.println("Could not get tool with id " + line.getToolId() + " for order formatting.");
            return "";
        }

        Optional<Supplier> supplier = supplierService.getSupplierById(line.getSupplierId());
        if (!supplier.isPresent())
        {
            System.err.println("Could not get supplier with id " + line.getSupplierId() + " for order formatting.");
            return "";
        }

        return formatOrderLine(tool.get().getName(), line.getQuantity(), supplier.get().getCompanyName());
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    public String formatOrderLine(String toolName, int quantity, String supplierName)
    {
        StringBuilder builder = new StringBuilder();

        builder.append("Item description:\t").append(toolName).append("\n");
        builder.append("Amount ordered:\t").append(quantity).append("\n");
        builder.append("Supplier:\t\t").append(supplierName);

        return builder.toString();
    }
}
