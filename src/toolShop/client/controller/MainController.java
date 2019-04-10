package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.LoginService;
import toolShop.OrderService;
import toolShop.client.GUI;
import toolShop.client.OrderFormatter;

import java.util.ArrayList;

/**
 * Controller which connects the GUI to the InventoryController, OrderController, and LoginController
 */
public class MainController
{
    /**
     * User Interface
     */
    GUI view;

    /**
     * List of controllers relating to the InventoryService
     */
    ArrayList<InventoryController> inventoryController;

    /**
     * List of controllers relating to the OrderService
     */
    ArrayList<OrderController> orderController;

    ArrayList<LoginController> loginController;


    /**
     * Displays GUI
     *
     * @param view
     */
    public MainController(GUI view)
    {
        this.view = view;
        inventoryController = new ArrayList<>();
        orderController = new ArrayList<>();
        loginController = new ArrayList<>();

        view.setVisible(true);
    }

    /**
     * Adds all InventoryControllers
     *
     * @param inventory
     */
    public void addInventoryControllers(InventoryService inventory)
    {
        inventoryController.add(new SearchNameListener(view, inventory));
        inventoryController.add(new ListToolsListener(view, inventory));
        inventoryController.add(new SearchIDListener(view, inventory));
        inventoryController.add(new BuyAmountCustomerListener(view, inventory));
        inventoryController.add(new DecreaseQuantityOwnerListener(view, inventory));
        inventoryController.add(new AddToolListener(view, inventory));
        inventoryController.add(new RemoveToolListener(view, inventory));
    }

    /**
     * Adds all OrderControllers
     *
     * @param order
     * @param orderFormatter
     */
    public void addOrderControllers(OrderService order, OrderFormatter orderFormatter)
    {
        orderController.add(new PlaceOrderListener(view, order, orderFormatter));
        orderController.add(new PrintOrderListener(view, order, orderFormatter));
    }

    public void addLoginControllers(LoginService login)
    {
        loginController.add(new LoginOwnerListener(view, login));
        loginController.add(new AddNewUserListener(view, login));
    }

}
