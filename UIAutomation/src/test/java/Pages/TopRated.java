package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TopRated {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    WebDriver webDriver;

    private By moviesSelection = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[1]/a");
    private By topRated = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[1]/div/ul/li[4]");
    private By filters = By.xpath("//*[@id=\"media_v4\"]/div/div/div[2]/div[1]/div[2]/div[1]");
    private By actionFilter = By.xpath("//*[@id=\"with_genres\"]/li[1]/a");
    private By searchFilter = By.xpath("//*[@id=\"media_v4\"]/div/div/div[2]/div[1]/div[4]/p/a");

    public TopRated(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void moviesFilter(){
        logger.log(Level.INFO,"The user wants to see the top rated movies");
        webDriver.findElement(moviesSelection).click();
        webDriver.findElement(topRated).click();
        webDriver.findElement(filters).click();
        logger.log(Level.INFO,"The user wants to filter for 'action' movies");
        webDriver.findElement(actionFilter).click();
        webDriver.findElement(searchFilter).click();
    }
}

