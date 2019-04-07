package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.OrderService;
import toolShop.client.GUI;
import toolShop.client.OrderFormatter;
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
    OrderFormatter orderFormatter;
    GUI view;

    public ClientController(GUI gui, InventoryService inventory, OrderService order, OrderFormatter orderFormatter)
    {
        this.inventory = inventory;
        this.order = order;
        this.orderFormatter = orderFormatter;

        view = gui;
        view.setVisible(true);

        //setActionListeners of buttons relating to inventory
        view.getListToolsCustomer().addActionListener(new ListToolsActionListener());
        view.getListToolsOwner().addActionListener(new ListToolsActionListener());
        view.getSearchNameAccept().addActionListener(new SearchNameAcceptActionListener());
        view.getSearchNameAccept1().addActionListener(new SearchNameAcceptActionListener());
        view.getSearchIDAccept().addActionListener(new SearchIDAcceptActionListener());
        view.getBuyAmountAccept().addActionListener(new BuyAmountAcceptActionListener());
        view.getDecreaseQuantityAccept().addActionListener(new DecreaseQuantityAcceptActionListener());
        view.getAddToolButton().addActionListener(new AddToolButtonActionListener());
        view.getRemoveItemButton().addActionListener(new RemoveToolButtonActionListener());
        view.getPrintOrder().addActionListener(new PrintTodayOrderActionListener());
        view.getPlaceOrderAccept().addActionListener(new PlaceOrderAcceptButton());

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
     * ActionListener for Shop Owner and Customer "Search by Name" button
     */
    class SearchNameAcceptActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String nameToSearch = nameTextArea(e).getText();
            Iterable<Tool> tools = inventory.getToolsWithName(nameToSearch);
            ArrayList<Tool> collected = new ArrayList<>();
            tools.forEach(collected::add);
            view.getNameTextArea().setText("");
            if (collected.size() != 0)
            {
                display(e).setText("");
                for (Tool tool : collected)
                {
                    display(e).append(tool.toString());
                }
                view.getSuccessDialog().setVisible(true);
            } else
            {
                display(e).setText("Tool with name " + nameToSearch + " could not be found");
                view.getFailDialog().setVisible(true);
            }
            view.getSearchByNameDialog().setVisible(false);
        }

        private JTextArea nameTextArea(ActionEvent e)
        {
            if (e.getSource() == view.getSearchNameAccept())
                return view.getNameTextArea();
            else
                return view.getNameTextArea1();
        }

        private JTextArea display(ActionEvent e)
        {
            if (e.getSource() == view.getSearchNameAccept())
                return view.getOwnerDisplay();
            else
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
                if (view.getIdTextArea().getText() != null)
                {
                    int idToSearch = Integer.parseInt(view.getIdTextArea().getText());
                    Optional<Tool> searchedTool = inventory.getToolById(idToSearch);
                    view.getIdTextArea().setText("");
                    if (searchedTool.isPresent())
                    {
                        view.getOwnerDisplay().setText("");
                        Tool tool = searchedTool.get();
                        view.getOwnerDisplay().append(tool.toString());
                        view.getSuccessDialog().setVisible(true);
                    } else
                    {
                        view.getFailDialog().setVisible(true);
                        view.getOwnerDisplay().setText("Tool with id #" + idToSearch + " could not be found");
                    }
                    view.getSearchByIDDialog().setVisible(false);
                }
            } catch (NumberFormatException e1)
            {
                view.getFailDialog().setVisible(true);
                view.getOwnerDisplay().setText("Tool could not be found");
            }
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
            boolean bool;
            try
            {
                int toolID = Integer.parseInt(toolInfo);
                bool = inventory.reduceToolQuantity(toolID, amountToDecrease);
            } catch (NumberFormatException exception)
            {
                ArrayList<Tool> toolList = (ArrayList<Tool>) inventory.getToolsWithName(toolInfo);
                bool = inventory.reduceToolQuantity(toolList.get(0).getId(), amountToDecrease);
            }
            if (bool)
                view.getOwnerDisplay().setText(toolInfo + " successfully decreased");
            else
                view.getOwnerDisplay().setText(toolInfo + " NOT successfully decreased");
            // Todo: Add checkStock to ensure quantity is above limit
            //theShop.checkStock(theTool);
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
                boolean bool = inventory.addTool(tool);
                view.getOwnerDisplay().setText("");
                if (bool)
                {
                    view.getOwnerDisplay().setText("Tool successfully added.\n");
                    view.getSuccessDialog().setVisible(true);

                } else
                {
                    view.getOwnerDisplay().setText("Tool could not be added.\n");
                    view.getFailDialog().setVisible(true);

                }
                view.getOwnerDisplay().append(tool.toString());

            } catch (Exception e1)
            {
                view.getOwnerDisplay().setText("The tool could not be added.\n");
                view.getFailDialog().setVisible(true);
            }
        }
    }

    class RemoveToolButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            boolean bool;
            int id = -1;
            try
            {
                id = Integer.parseInt(view.getRemoveItemArea().getText());
                bool = inventory.removeTool(id);
            } catch (NumberFormatException e1)
            {
                bool = false;
            }
            view.getOwnerDisplay().setText("");
            if (bool)
            {
                view.getOwnerDisplay().setText("Tool " + id + " was successfully removed.\n");
                view.getSuccessDialog().setVisible(true);
            } else
            {
                view.getOwnerDisplay().setText("Tool was NOT successfully removed.\n");
                view.getFailDialog().setVisible(true);
            }
        }
    }

    class PrintTodayOrderActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("");
            view.getOwnerDisplay().setText(orderFormatter.formatOrder(order.getOrder()));
        }
    }

    class PlaceOrderAcceptButton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.getOwnerDisplay().setText("Order executed successfully");
            order.executeOrder(order.getOrder());
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
            ArrayList<Tool> toolList = (ArrayList<Tool>) inventory.getToolsWithName(itemName);
            if (!toolList.isEmpty())
            {
                boolean bool = inventory.reduceToolQuantity(toolList.get(0).getId(), amountToBuy);
                if (bool)
                {
                    view.getCustomerDisplay().setText(itemName + " successfully purchased");
                    view.getSuccessDialog().setVisible(true);
                } else
                {
                    view.getCustomerDisplay().setText(itemName + " NOT successfully purchased");
                    view.getFailDialog().setVisible(true);
                }
            }
            else
            {
                view.getCustomerDisplay().setText(itemName + " NOT successfully purchased");
                view.getFailDialog().setVisible(true);
            }

            view.getBuyItemDialog().setVisible(false);
        }
    }
}
