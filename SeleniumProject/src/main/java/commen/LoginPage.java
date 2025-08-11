package commen;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By LoginButton= By.id("login-button"); 
    private By errorMessage =By.cssSelector("#login_button_container h3") ;

    public void setUsername(String username)  {
        set(usernameField,username);  }

    public void setPassword(String password)  {
        set(passwordField,password);  }

    public ProductPage clickLoginButton() {
        click(LoginButton);
        return new ProductPage();

    }
    public ProductPage logIntoApp(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();


    }

    public String getErrorMessage() {

        return find(errorMessage).getText();
    }


}


