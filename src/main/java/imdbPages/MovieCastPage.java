package imdbPages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.byXpath;

public class MovieCastPage extends BasePage{
    private final ElementsCollection movieCast = $$(byXpath("//div[@data-testid='sub-section-cast']" +
            "//a[contains(@class, 'name-credits--title-text-big')]"));

    public List<String> getMovieCast() {
        return movieCast.stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
    }
}