package Pages;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    WebDriver webDriver;
    private By searchBar = By.id("inner_search_v4");
    private By searchButtom = By.xpath("//*[@id=\"inner_search_form\"]/input");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void searchMovie(String movie){
        logger.log(Level.INFO,"The movie is being written on searching bar");
        webDriver.findElement(searchBar).sendKeys(movie);
        logger.log(Level.INFO,"The search Buttom is being pressed");
        webDriver.findElement(searchButtom).click();
    }
}
