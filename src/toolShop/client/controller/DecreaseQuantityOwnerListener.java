package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DecreaseQuantityOwnerListener extends InventoryController
{

    public DecreaseQuantityOwnerListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getDecreaseQuantityAccept().addActionListener(new DecreaseQuantityAcceptActionListener());
    }


    /**
     * ActionListener for Shop Owner decrease by amount button
     */
    class DecreaseQuantityAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int amountToDecrease = Integer.parseInt(view.getAmountToDecreaseField().getText());
            String toolInfo = view.getDecreaseTextArea().getText();
            boolean bool;
            try
            {
                int toolID = Integer.parseInt(toolInfo);
                bool = inventory.reduceToolQuantity(toolID, amountToDecrease);
            } catch (NumberFormatException exception)
            {
                ArrayList<Tool> toolList = (ArrayList<Tool>) inventory.getToolsWithName(toolInfo);
                bool = inventory.reduceToolQuantity(toolList.get(0).getId(), amountToDecrease);
            }
            if (bool)
                view.getOwnerDisplay().setText(toolInfo + " successfully decreased");
            else
                view.getOwnerDisplay().setText(toolInfo + " NOT successfully decreased");
            view.getDecreaseTextArea().setText("");
            view.getDecreaseQuantityDialog().setVisible(false);
        }
    }
}
