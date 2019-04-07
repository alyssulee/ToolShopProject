package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;

/**
 * Controller superclass, which connects functions pertaining to the inventory to the GUI
 */
abstract public class InventoryController
{
    InventoryService inventory;
    GUI view;

    /**
     * Sets the GUI and InventoryService
     *
     * @param gui
     * @param inventory
     */
    public InventoryController(GUI gui, InventoryService inventory)
    {
        this.inventory = inventory;
        view = gui;
    }
}
