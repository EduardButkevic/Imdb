package imdbPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    protected final SelenideElement acceptCookies = $(byXpath("//button[@data-testid='accept-button']"));
    protected final SelenideElement searchInput = $(byXpath("//input[@data-testid='suggestion-search']"));
    protected final SelenideElement searchSuggestions = $(byXpath("//div[@id='react-autowhatever-navSuggestionSearch']"));

    public void acceptCookies(){
        acceptCookies.click();
    }

    public void enterTextInSearchInput(String text){
        searchInput.sendKeys(text);
    }

    public MoviePage openFirstMovieFromSearchSuggestions(){
        waitForSearchSuggestions();
        SelenideElement element = $(byXpath("//li[not(contains(@class, 'react-autosuggest__suggestion--first'))]" +
                "//div[contains(@class, 'ipc-media--poster-27x40')]"));
        element.click();
        return new MoviePage();
    }

    private void waitForSearchSuggestions() {
        searchSuggestions.shouldBe(Condition.visible);
    }
}