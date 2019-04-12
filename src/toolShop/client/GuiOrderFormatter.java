/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */

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

/**
 * Formats an order to a string appropriate for display in the GUI.
 */
public class GuiOrderFormatter implements OrderFormatter
{
    /**
     * The inventory.
     */
    private InventoryService inventory;

    /**
     * The supplier service.
     */
    private SupplierService supplierService;

    /**
     * Creates a GUI order formatter.
     *
     * @param inventory       The inventory service.
     * @param supplierService The supplier service.
     */
    public GuiOrderFormatter(InventoryService inventory, SupplierService supplierService)
    {
        this.inventory = inventory;
        this.supplierService = supplierService;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * Formats a date to a string.
     *
     * @param date The date.
     * @return The formatted string.
     */
    private String formatDate(Date date)
    {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        return dateFormat.format(date);
    }

    /**
     * Formats an order line to a string.
     *
     * @param line The order line.
     * @return The formatted string.
     */
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

    /**
     * Formats an order line to a string.
     *
     * @param toolName     The tool name.
     * @param quantity     The order quantity.
     * @param supplierName The supplier name.
     * @return The formatted string.
     */
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
