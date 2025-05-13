package imdbTests;

import com.codeborne.selenide.Configuration;
import driver.DriverFactory;
import helpers.SettingsHelper;
import imdbPages.GenericPages;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        Configuration.timeout = SettingsHelper.getLong("timeOutInMilliseconds");
        DriverFactory.initialize();
        open(SettingsHelper.getString("appUrl"));
        getWebDriver().manage().window().maximize();
        GenericPages.homepage.acceptCookies();
    }

    @AfterMethod
    public  void tearDown(){
        DriverFactory.closeBrowser();
    }
}