package elements;

import org.openqa.selenium.By;

public class Input extends BaseElement{
    public Input(By locator) {
        super(locator);
    }

    public void sendKeys(String keys){
        element.sendKeys(keys);
    }
}
