package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListToolsListener extends InventoryController
{

    public ListToolsListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getListToolsCustomer().addActionListener(new ListToolsActionListener());
        view.getListToolsOwner().addActionListener(new ListToolsActionListener());
    }


    /**
     * ActionListener for Customer and Shop Owner "List all Tools" button
     */
    class ListToolsActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Iterable<Tool> toolList = inventory.getAllTools();
            if (e.getSource() == view.getListToolsOwner())
            {
                view.getOwnerDisplay().setText("");
                ownerDisplay(toolList);
            } else
            {
                view.getCustomerDisplay().setText("");
                customerDisplay(toolList);
            }
        }

        private void ownerDisplay(Iterable<Tool> toolList)
        {
            for (Tool t : toolList)
            {
                view.getOwnerDisplay().append(t.toString());
            }
        }

        private void customerDisplay(Iterable<Tool> toolList)
        {
            for (Tool t : toolList)
            {
                view.getCustomerDisplay().append(t.toString());
            }
        }
    }
}
