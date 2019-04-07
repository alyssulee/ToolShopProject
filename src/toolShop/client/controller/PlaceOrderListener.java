package toolShop.client.controller;

import toolShop.OrderService;
import toolShop.client.GUI;
import toolShop.client.OrderFormatter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * OrderController which connects the "Place" daily order Button in the GUI to the action listener
 */
public class PlaceOrderListener extends OrderController
{
    /**
     * Constructs a PlaceOrderListener object and sets the button's ActionListener
     */
    public PlaceOrderListener(GUI gui, OrderService order, OrderFormatter orderFormatter)
    {
        super(gui, order, orderFormatter);
        view.getPlaceOrderAccept().addActionListener(new PlaceOrderAcceptButton());
    }

    /**
     * Inner class ActionListener which executes the order when the "Place" order button in the Shop Owner window is pressed
     */
    class PlaceOrderAcceptButton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("Order executed successfully");
            order.executeOrder(order.getOrder());
        }
    }
}
