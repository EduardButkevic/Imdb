package imdbTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeClass
    public void setUp() {
        open("https://www.imdb.com/");
        getWebDriver().manage().window().maximize();
    }

    @Test
    public void printOut5MembersOfTheTopCastSection() {
    }
}