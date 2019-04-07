package toolShop.client.controller;

import toolShop.LoginService;
import toolShop.client.GUI;

/**
 * Controller superclass, which connects functions pertaining to the login to the GUI
 */
abstract public class LoginController
{
    LoginService loginService;
    GUI view;

    /**
     * Sets the GUI and LoginService
     *
     * @param view
     * @param loginService
     */
    public LoginController(GUI view, LoginService loginService)
    {
        this.view = view;
        this.loginService = loginService;
    }
}
