package imdbPages;

import elements.Button;
import elements.Input;
import org.openqa.selenium.By;

public class BasePage {
    protected Button acceptCookies = new Button(By.xpath("//button[@data-testid='accept-button']"));
    protected Input searchInput = new Input(By.xpath("//input[@data-testid='suggestion-searchss']"));
    protected Button submitSearchButton = new Button(By.xpath("//button[@id='suggestion-search-button']"));

    public void acceptCookies(){
        acceptCookies.click();
    }

    public void enterTextInSearchInput(String text){
        searchInput.sendKeys(text);
    }

    public void clickSubmitSearchButton(){
        submitSearchButton.click();
    }
}
