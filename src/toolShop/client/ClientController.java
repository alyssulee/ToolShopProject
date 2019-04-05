package toolShop.client;

import toolShop.InventoryService;
import toolShop.OrderService;
import toolShop.models.Tool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;

public class ClientController
{

    InventoryService inventory;
    OrderService order;
    GUI view;

    public ClientController(InventoryService inventory, OrderService order, GUI gui)
    {
        this.inventory = inventory;
        this.order = order;
        view = gui;
        view.setVisible(true);

        //setActionListeners of buttons relating to inventory
        view.getListToolsCustomer().addActionListener(new ListToolsActionListener());
        view.getListToolsOwner().addActionListener(new ListToolsActionListener());
        view.getSearchNameAccept().addActionListener(new SearchNameAcceptActionListener());
        view.getSearchIDAccept().addActionListener(new SearchIDAcceptActionListener());
        view.getBuyAmountAccept().addActionListener(new BuyAmountAcceptActionListener());
        view.getDecreaseQuantityAccept().addActionListener(new DecreaseQuantityAcceptActionListener());
        view.getAddToolButton().addActionListener(new AddToolButtonActionListener());

        view.getPrintOrder().addActionListener(new PrintTodayOrderActionListener());

        /*view.setBuyAmountAcceptActionListener(new BuyAmountAcceptActionListener());
        view.setDecreaseQuantityAcceptActionListener(new decreaseQuantityAcceptActionListener());
        view.setCheckQuantityAcceptActionListener(new checkQuantityAcceptActionListener());
        view.setSearchNameAcceptActionListener(new searchNameAcceptActionListener());
        view.setSearchIDAcceptActionListener(new searchIDAcceptActionListener());
        view.setListToolsActionListener(new listToolsActionListener());*/
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


    /**
     * ActionListener for Shop Owner search by name
     */
    class SearchNameAcceptActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            JTextArea display = display(e);
            String nameToSearch = view.getNameTextArea().getText();
            Iterable<Tool> tools = inventory.getToolsWithName(nameToSearch);
            ArrayList<Tool> collected = new ArrayList<>();
            tools.forEach(collected::add);
            view.getNameTextArea().setText("");
            if (collected.size() != 0)
            {
                display.setText("");
                for (int i = 0; i < collected.size(); i++)
                {
                    Tool tool = collected.get(i);
                    display.append(tool.toString());
                }
            } else
            {
                display.setText("Tool with name " + nameToSearch + " could not be found");
            }
            view.getSearchByNameDialog().setVisible(false);
        }

        private JTextArea display(ActionEvent e)
        {
            if (e.getSource() == view.getSearchNameAccept())
                return view.getOwnerDisplay();
            else
                //Todo: Fix get source... always prints to owner display
                return view.getCustomerDisplay();
        }
    }

    /**
     * ActionListener for Shop Owner "Search by Name" button
     */
    class SearchIDAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                int idToSearch = Integer.parseInt(view.getIdTextArea().getText());
                Optional<Tool> searchedTool = inventory.getToolById(idToSearch);
                view.getIdTextArea().setText("");
                if (searchedTool.isPresent())
                {
                    view.getOwnerDisplay().setText("");
                    Tool tool = searchedTool.get();
                    view.getOwnerDisplay().append(tool.toString());
                } else
                {
                    view.getOwnerDisplay().setText("Tool with id #" + idToSearch + " could not be found");
                }
                view.getSearchByIDDialog().setVisible(false);
            } catch (NumberFormatException e1)
            {
                view.getOwnerDisplay().setText("Tool could not be found");
            }
        }
    }

    /**
     * ActionListener for Shop Owner "Check Quantity" button
     */
    class CheckQuantityAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String input = view.getIdTextArea().getText();

            try
            {
                int idToSearch = Integer.parseInt(input);
                Optional<Tool> tools = inventory.getToolById(idToSearch);
                ArrayList<Tool> collected = new ArrayList<>();
                collected.set(0, tools.get());
                if (collected.size() != 0)
                {
                    view.getOwnerDisplay().setText("");
                    for (int i = 0; i < collected.size(); i++)
                    {
                        Tool tool = collected.get(i);
                        view.getOwnerDisplay().append("Tool found.\tStock: " + tool.getQuantity() + "\n");
                        //inventory.checkStock(tool);
                        //Todo add stock checking capability
                    }
                } else
                {
                    view.getOwnerDisplay().setText("This tool could not be found.\n");
                }

            } catch (java.lang.NumberFormatException string)
            {
                Iterable<Tool> tools = inventory.getToolsWithName(input);
                ArrayList<Tool> collected = new ArrayList<>();
                tools.forEach(collected::add);
                if (tools != null)
                {
                    view.getOwnerDisplay().setText("");
                    for (int i = 0; i < collected.size(); i++)
                    {
                        Tool tool = collected.get(i);
                        view.getOwnerDisplay().append("Tool found.\tStock: " + tool.getQuantity() + "\n");
                        //inventory.checkStock(tool);
                    }
                } else
                {
                    view.getOwnerDisplay().setText("This tool could not be found.\n");
                }


            }
            view.getIdTextArea().setText("");
            view.getCheckQuantityDialog().setVisible(false);
        }
    }


    /**
     * ActionListener for Shop Owner decrease by amount button
     */
    class DecreaseQuantityAcceptActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int amountToDecrease = Integer.parseInt(view.getAmountToDecreaseField().getText());
            String toolInfo = view.getDecreaseTextArea().getText();
            try
            {
                int toolID = Integer.parseInt(toolInfo);
                inventory.reduceToolQuantity(toolID, amountToDecrease);

            } catch (NumberFormatException exception)
            {
                ArrayList<Tool> tool = (ArrayList<Tool>) inventory.getToolsWithName(toolInfo);
                inventory.reduceToolQuantity(tool.get(0).getId(), amountToDecrease);
            }
            view.getOwnerDisplay().setText("New quantity set: \n");
            view.getDecreaseTextArea().setText("");
            view.getDecreaseQuantityDialog().setVisible(false);
        }
    }

    /**
     * ActionListener for Shop Owner add tool
     */
    class AddToolButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                String name = view.getAddToolNameArea().getText();
                int id = Integer.parseInt(view.getAddToolIDArea().getText());
                int stock = Integer.parseInt(view.getAddToolStockArea().getText());
                double price = Double.parseDouble(view.getAddToolPriceArea().getText());
                int supplierID = Integer.parseInt(view.getAddToolSupplierIDArea().getText());

                Tool tool = new Tool(id, name, stock, price, supplierID);
                inventory.addTool(tool);
                view.getOwnerDisplay().setText("");
                view.getOwnerDisplay().setText("Tool successfully added.\n");
                view.getOwnerDisplay().append(tool.toString());

            } catch (Exception e1)
            {
                view.getOwnerDisplay().setText("The tool could not be added.\n");
            }
        }
    }

    class RemoveToolButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {


        }
    }

    class PrintTodayOrderActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("");
            view.getOwnerDisplay().setText(order.getOrder().printOrder());
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
            int amountToBuy = Integer.parseInt(view.getAmountToBuyField().getText());
            String itemName = view.getBuyTextArea().getText();

            //Decrease stock by this amount
            ArrayList<Tool> tool = (ArrayList<Tool>) inventory.getToolsWithName(itemName);
            inventory.reduceToolQuantity(tool.get(0).getId(), amountToBuy);

            // Todo: Add checkStock to ensure quantity is above limit
            view.getCustomerDisplay().setText("Purchase successful.");
            view.getBuyItemDialog().setVisible(false);
        }
    }
}
