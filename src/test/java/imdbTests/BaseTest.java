package imdbTests;

import com.codeborne.selenide.Configuration;
import imdbPages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    HomePage homePage = new HomePage();

    @BeforeClass
    public void setUp() {
        Configuration.timeout = 10000;
        open("https://www.imdb.com/");
        getWebDriver().manage().window().maximize();
        homePage.acceptCookies();
    }

    @Test
    public void printOut5MembersOfTheTopCastSection() {
        homePage.enterTextInSearchInput("QA");
        homePage.clickSubmitSearchButton();
    }
}