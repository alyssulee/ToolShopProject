package toolShop.client;

import toolShop.InventoryService;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController
{

    InventoryService inventory;
    GUI view;

    public ClientController(InventoryService inventory, GUI gui)
    {
        this.inventory = inventory;
        view = gui;
        view.setVisible(true);

        //setActionListeners of buttons relating to inventory
        view.setListToolsOwnerActionListener(new ListToolsOwnerActionListener());
    }

    //ActionListener Classes
    class ListToolsOwnerActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("");
            Iterable<Tool> toolList = inventory.getAllTools();
            for (Tool t : toolList)
            {
                //Tool t = new Tool(1, "asdf", 9, 12.2, 12345);
                view.getOwnerDisplay().append(t.toString());
            }
        }
    }


}
