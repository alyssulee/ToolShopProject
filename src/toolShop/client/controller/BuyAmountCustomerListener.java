package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * InventoryController which connects the "Buy Item" Button in the GUI to the action listener
 */
public class BuyAmountCustomerListener extends InventoryController
{
    /**
     * Creates a BuyAmountCstomerListener and sets the button's ActionListener
     *
     * @param gui
     * @param inventory
     */
    public BuyAmountCustomerListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getBuyAmountAccept().addActionListener(new BuyAmountAcceptActionListener());
    }


    /**
     * ActionListener for customer purchase button
     */
    class BuyAmountAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int amountToBuy = Integer.parseInt(view.getAmountToBuyField().getText());
            String itemName = view.getBuyTextArea().getText();

            ArrayList<Tool> toolList = (ArrayList<Tool>) inventory.getToolsWithName(itemName);
            boolean bool = !toolList.isEmpty(); //bool = true if not empty
            if (bool)
            {
                bool = inventory.reduceToolQuantity(toolList.get(0).getId(), amountToBuy);
            }
            if (bool)
            {
                view.getCustomerDisplay().setText(itemName + " successfully purchased");
                view.getSuccessDialog().setVisible(true);
            } else
            {
                view.getCustomerDisplay().setText(itemName + " NOT successfully purchased");
                view.getFailDialog().setVisible(true);
            }

            view.getBuyItemDialog().setVisible(false);
        }
    }
}
