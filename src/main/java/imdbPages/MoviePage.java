package imdbPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MoviePage extends BasePage{
    private final SelenideElement movieCastButton = $(byXpath("//section[p[@data-testid='plot']]" +
            "//li[.//a[contains(@href, 'cast')]]//*[contains(@class, 'chevron-right')]"));

    public MovieCastPage openMovieCastPage(){
        movieCastButton.click();
        return new MovieCastPage();
    }
}