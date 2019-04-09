package toolShop.client.controller;

import toolShop.LoginService;
import toolShop.client.GUI;
import toolShop.models.UserType;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewUserListener extends LoginController
{

    /**
     * Sets the GUI and LoginService
     * *
     *
     * @param view
     * @param loginService
     */
    public AddNewUserListener(GUI view, LoginService loginService)
    {
        super(view, loginService);
        view.getAddLoginButton().addActionListener(new AddNewUserActionListener());
    }

    class AddNewUserActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String username = view.getLoginNewUsernameField().getText();
            String password = view.getLoginNewPasswordField().getText();
            boolean bool = loginService.addUser(username, password, UserType.Owner);
            if (bool)
            {
                view.getOwnerDisplay().setText(username + " added successfully");
                view.getSuccessDialog().setVisible(true);
            } else
            {
                view.getOwnerDisplay().setText(username + " already exists. New user not added successfully");
                view.getFailDialog().setVisible(true);
            }
            view.getLoginNewUsernameField().setText("");
            view.getLoginNewPasswordField().setText("");
            view.getAddOwnerLoginMenu().setVisible(false);

        }
    }

}
