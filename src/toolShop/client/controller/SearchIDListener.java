package toolShop.client.controller;

import toolShop.InventoryService;
import toolShop.client.GUI;
import toolShop.models.Tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

/**
 * InventoryController which connects the "Search by ID" Button in the GUI to the action listener
 */
public class SearchIDListener extends InventoryController
{
    /**
     * Constructs a SearchIDListener object and sets the button's ActionListener
     *
     * @param gui
     * @param inventory
     */
    public SearchIDListener(GUI gui, InventoryService inventory)
    {
        super(gui, inventory);
        view.getSearchIDAccept().addActionListener(new SearchIDAcceptActionListener());
    }


    /**
     * ActionListener for Shop Owner "Search by ID" button
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
}
