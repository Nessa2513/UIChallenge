package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInPage {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    WebDriver webDriver;
    private By usernameId = By.id("username");
    private By passwordId = By.id("password");
    private By logInButtom = By.id("login_button");

    public LogInPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean usernameLogIn(String username){
        logger.log(Level.INFO,"The username is being written");
        webDriver.findElement(usernameId).sendKeys(username);
        return false;
    }
    public boolean passwordLogIn(String password){
        logger.log(Level.INFO,"The password is being written");
        webDriver.findElement(passwordId).sendKeys(password);
        return false;
    }
    public void logInBtn(){
        logger.log(Level.INFO,"The Login Button is being pressed");
        webDriver.findElement(logInButtom).click();
    }
}
