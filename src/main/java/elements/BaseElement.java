package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseElement {
    protected By locator;
    protected SelenideElement element;

    public BaseElement(By locator) {
        this.locator = locator;
        this.element = $(locator);
    }

    public void click() {
        element.click();
    }

    public SelenideElement get() {
        return element;
    }
}