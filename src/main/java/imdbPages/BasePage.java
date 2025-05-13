package imdbPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    protected SelenideElement acceptCookies = $(byXpath("//button[@data-testid='accept-button']"));
    protected SelenideElement searchInput = $(byXpath("//input[@data-testid='suggestion-search']"));
    protected SelenideElement submitSearchButton = $(byXpath("//button[@id='suggestion-search-button']"));
    protected SelenideElement searchSuggestions = $(byXpath("//div[@id='react-autowhatever-navSuggestionSearch']"));

    public void acceptCookies(){
        acceptCookies.click();
    }

    public void enterTextInSearchInput(String text){
        searchInput.sendKeys(text);
    }

    public void clickSubmitSearchButton(){
        submitSearchButton.click();
    }

    public void clickFirstMovieFromSearchSuggestions(){
        waitForSearchSuggestions();
        SelenideElement element = $(byXpath("//li[not(contains(@class, 'react-autosuggest__suggestion--first'))]" +
                "//div[contains(@class, 'ipc-media--poster-27x40')]"));
        element.click();
    }

    private void waitForSearchSuggestions() {
        searchSuggestions.shouldBe(Condition.visible);
    }
}