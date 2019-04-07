package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveToolListener extends InventoryController
{
    public RemoveToolListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getRemoveItemButton().addActionListener(new RemoveToolButtonActionListener());
    }


    class RemoveToolButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            boolean bool;
            int id = -1;
            try
            {
                id = Integer.parseInt(view.getRemoveItemArea().getText());
                bool = inventory.removeTool(id);
            } catch (NumberFormatException e1)
            {
                bool = false;
            }
            if (bool)
            {
                view.getOwnerDisplay().setText("Tool " + id + " was successfully removed.\n");
                view.getSuccessDialog().setVisible(true);
            } else
            {
                view.getOwnerDisplay().setText("Tool was NOT successfully removed.\n");
                view.getFailDialog().setVisible(true);
            }
        }
    }
}
