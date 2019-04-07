package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * InventoryController which connects the "Add Tool" Button in the GUI to the action listener
 */
public class AddToolListener extends InventoryController
{
    /**
     * Creates an AddToolListener and sets the button's ActionListener
     *
     * @param gui
     * @param inventory
     */
    public AddToolListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getAddToolButton().addActionListener(new AddToolButtonActionListener());
    }


    /**
     * ActionListener which adds a tool when the "Add Tool" button in the Shop Owner window is pressed
     */
    class AddToolButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            boolean bool;
            Tool tool = null;
            try
            {
                String name = view.getAddToolNameArea().getText();
                int id = Integer.parseInt(view.getAddToolIDArea().getText());
                int stock = Integer.parseInt(view.getAddToolStockArea().getText());
                double price = Double.parseDouble(view.getAddToolPriceArea().getText());
                int supplierID = Integer.parseInt(view.getAddToolSupplierIDArea().getText());

                tool = new Tool(id, name, stock, price, supplierID);
                bool = inventory.addTool(tool);
            } catch (Exception e1)
            {
                bool = false;
            }

            if (bool)
            {
                view.getOwnerDisplay().setText("Tool successfully added.\n");
                view.getOwnerDisplay().append(tool.toString());
                view.getSuccessDialog().setVisible(true);
            } else
            {
                view.getOwnerDisplay().setText("Tool could not be added.\n");
                view.getFailDialog().setVisible(true);
            }
        }
    }
}
