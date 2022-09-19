import Pages.Header;
import Pages.LogInPage;
import Pages.MainPage;
import Pages.TopRated;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Hooks{
    @Test
    public void openBrowser(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.searchMovie("Fight Club");
    }
    @Test
    public void superiorHeader(){
        Header header = new Header(webDriver);
        LogInPage logInPage = new LogInPage(webDriver);
        header.LogIn();
        logInPage.usernameLogIn("nessa.cardenas");
        logInPage.passwordLogIn("Hola123.");
        logInPage.logInBtn();
        Assert.assertTrue(logInPage.usernameLogIn("nessa.cardenas"), "The credentials are incorrect");
        Assert.assertTrue(logInPage.passwordLogIn("Hola123."), "Please try again, you have 7 remaining login attempts");
    }
    @Test
    public void actionFilter(){
        TopRated topRated = new TopRated(webDriver);
        topRated.moviesFilter();
    }
}
