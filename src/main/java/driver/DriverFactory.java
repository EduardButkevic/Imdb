package driver;

import com.codeborne.selenide.WebDriverRunner;
import helpers.SettingsHelper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class DriverFactory {

    public static void initialize() {
        String browser = SettingsHelper.getString("browser").toLowerCase(Locale.ROOT);

        switch (browser) {
            case "chrome" -> WebDriverRunner.setWebDriver(new ChromeDriver());
            case "firefox" -> WebDriverRunner.setWebDriver(new FirefoxDriver());
            default -> throw new IllegalArgumentException(String.format("Unsupported browser: %s", browser));
        }
    }

    public static void closeBrowser() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            WebDriverRunner.getWebDriver().quit();
        }
    }
}
