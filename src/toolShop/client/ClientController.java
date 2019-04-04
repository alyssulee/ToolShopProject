package toolShop.client;

import toolShop.InventoryService;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

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
        view.setBuyAmountAcceptActionListener(new BuyAmountAcceptActionListener());
        view.setDecreaseQuantityAcceptActionListener(new decreaseQuantityAcceptActionListener());
        view.setCheckQuantityAcceptActionListener(new checkQuantityAcceptActionListener());
        view.setSearchNameAcceptActionListener(new searchNameAcceptActionListener());
        view.setSearchIDAcceptActionListener(new searchIDAcceptActionListener());
        view.setListToolsActionListener(new listToolsActionListener());
    }

    /**
     * ActionListener for Customer and Shop Owner "List all Tools" button
     */
    class listToolsActionListener implements ActionListener
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


    /**
     * ActionListener for Shop Owner and Customer "Search by Name" button
     */
    class searchNameAcceptActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String nameToSearch = view.getNameTextArea().getText();
            Iterable<Tool> t = inventory.getToolsWithName(nameToSearch);

            // Todo: Display tool or not found message to display
            view.getNameTextArea().setText("");
            view.getSearchByNameDialog().setVisible(false);
        }
    }

    /**
     * ActionListener for Shop Owner "Search by Name" button
     */
    class searchIDAcceptActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String idToSearch = view.getIdTextArea().getText();
            try
            {
                int id = Integer.parseInt(idToSearch);
                Optional<Tool> t = inventory.getToolById(id);
                // Todo: Display tool or not found message to display
                view.getIdTextArea().setText("");
                view.getSearchByIDDialog().setVisible(false);
            } catch (NumberFormatException exception)
            {
                // Todo: Catch exception
            }

        }
    }

    /**
     * ActionListener for Shop Owner "Check Quantity" button
     */
    class checkQuantityAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String toolInfo = view.getQuantityTextArea().getText();
            try
            {
                int toolID = Integer.parseInt(toolInfo);
                Optional<Tool> t = inventory.getToolById(toolID);
            } catch (NumberFormatException exception)
            {
                Iterable<Tool> t = inventory.getToolsWithName(toolInfo);
            }
            // Todo: Display tool quantity to display
            view.getQuantityTextArea().setText("");
            view.getCheckQuantityDialog().setVisible(false);
        }
    }


    /**
     * ActionListener for Shop Owner decrease by amount button
     */
    class decreaseQuantityAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int amountToDecrease = Integer.parseInt(view.getAmountToDecreaseText());
            String toolInfo = view.getDecreaseTextArea().getText();
            try
            {
                int toolID = Integer.parseInt(toolInfo);
                inventory.reduceToolQuantity(toolID, amountToDecrease);
            } catch (NumberFormatException exception)
            {
                //inventory.reduceToolQuantity(inventory.getToolsWithName(itemName), amountToBuy);
            }
            // Todo: Add checkStock to ensure quantity is above limit
            //theShop.checkStock(theTool);
            view.getDecreaseTextArea().setText("");
            view.getDecreaseQuantityDialog().setVisible(false);
        }
    }

    /**
     * ActionListener for customer purchase button
     */
    class BuyAmountAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int amountToBuy = Integer.parseInt(view.getAmountToBuyText());
            String itemName = view.getBuyTextAreaText();

            //Decrease stock by this amount
            //inventory.reduceToolQuantity(inventory.getToolsWithName(itemName), amountToBuy);

            view.getBuyItemDialog().setVisible(false);
        }
    }
}
