package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Header {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    WebDriver webDriver;
    private By logInButtom = By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/ul/li[3]/a");

    public Header(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void LogIn(){
        logger.log(Level.INFO,"Log in buttom has been pressed");
        webDriver.findElement(logInButtom).click();
    }
}
