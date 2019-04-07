package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchNameListener extends InventoryController
{
    public SearchNameListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getSearchNameAccept1().addActionListener(new SearchNameAcceptActionListener());
        view.getSearchNameAccept().addActionListener(new SearchNameAcceptActionListener());
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
}
