package toolShop.client.controller;

import toolShop.LoginService;
import toolShop.client.GUI;
import toolShop.models.UserType;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * LoginController which connects the "Login" Button in the GUI to the action listener
 */
public class LoginOwnerListener extends LoginController
{
    /**
     * Sets the GUI and LoginService as well as the button action listener
     *
     * @param view
     * @param loginService
     */
    public LoginOwnerListener(GUI view, LoginService loginService)
    {
        super(view, loginService);
        view.getAcceptLoginButton().addActionListener(new LoginActionListener());
    }

    /**
     * ActionListener which adds a user when the "Login" button in the Shop Owner window is pressed
     */
    public class LoginActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String username = view.getLoginUsernameField().getText();
            String password = view.getLoginPasswordField().getText();
            UserType userType = UserType.valueOf("Owner");

            view.getLoginUsernameField().setText("");
            view.getLoginPasswordField().setText("");
            boolean loggedIn = loginService.login(username, password, userType);
            if (loggedIn)
            {
                view.getOwnerClientMenu().setBounds(((int) view.getScreenSize().getWidth() - 880) / 2, ((int) view.getScreenSize().getHeight() - 650) / 2, 880, 590);
                view.getOwnerClientMenu().setVisible(true);
                view.getLoginMenu().setVisible(false);
            } else
            {
                view.getInvalidLoginPopup().setBounds(((int) view.getScreenSize().getWidth() - 403) / 2, ((int) view.getScreenSize().getHeight() - 250) / 2, 400, 100);
                view.getInvalidLoginPopup().setVisible(true);
            }
        }
    }
}
