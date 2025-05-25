package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test=error]");

    // setter method to set the username
    public void setUsername(String username) {
        set(usernameField, username);
    }

    // setter method to set the password
    public void setPassword(String password) {
        set(passwordField, password);
    }

    // transition method to click the login button (transition methods are never void, they always return a new page object)

    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    // convenience method to log into the application
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    // getter method to get the error message
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }


}
