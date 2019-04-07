package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;

/**
 * Controller superclass, which connects functions pertaining to the inventory to the GUI
 */
abstract public class InventoryController //implements ActionListener
{
    InventoryService inventory;
    GUI view;

    public InventoryController(GUI gui, InventoryService inventory)
    {
        this.inventory = inventory;
        view = gui;
    }
}
