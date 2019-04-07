package toolShop.client.controller;

import toolShop.OrderService;
import toolShop.client.GUI;
import toolShop.client.OrderFormatter;

/**
 * Controller superclass, which connects functions pertaining to orders to the GUI
 */
abstract public class OrderController
{
    OrderService order;
    GUI view;
    OrderFormatter orderFormatter;

    /**
     * Sets the GUI, OrderService, and OrderFormatter
     *
     * @param gui
     * @param order
     * @param orderFormatter
     */
    public OrderController(GUI gui, OrderService order, OrderFormatter orderFormatter)
    {
        view = gui;
        this.order = order;
        this.orderFormatter = orderFormatter;
    }
}
