package toolShop.client.controller;

import toolShop.OrderService;
import toolShop.client.GUI;
import toolShop.client.OrderFormatter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * OrderController which connects the "Print Today's Order" Button in the GUI to the action listener
 */
public class PrintOrderListener extends OrderController
{
    /**
     * Constructs a PrintOrderListener object and sets the button's ActionListener
     */
    public PrintOrderListener(GUI gui, OrderService order, OrderFormatter orderFormatter)
    {
        super(gui, order, orderFormatter);
        view.getPrintOrder().addActionListener(new PrintTodayOrderActionListener());
    }

    /**
     * Inner class ActionListener which prints the current order when the "Print Today's Order"  button in the Shop Owner window is pressed
     */
    class PrintTodayOrderActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("");
            view.getOwnerDisplay().setText(orderFormatter.formatOrder(order.getOrder()));
        }
    }
}
