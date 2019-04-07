package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;

import java.util.ArrayList;

public class MainController
{
    GUI view;
    ArrayList<InventoryController> inventoryController;

    public MainController(GUI view)
    {
        this.view = view;
        inventoryController = new ArrayList<>();
        view.setVisible(true);
    }

    public void addInventoryControllers(InventoryService inventory)
    {
        inventoryController.add(new SearchNameListener(view, inventory));
        inventoryController.add(new ListToolsListener(view, inventory));
    }

}
