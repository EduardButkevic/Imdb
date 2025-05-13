package imdbTests;

import imdbPages.GenericPages;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.util.List;

public class CastPageTests extends BaseTest {

    @Test
    @Description("Trumpas paaiškinimas, ką šis testas daro")
    @Severity(SeverityLevel.NORMAL)
    public void printOut5MembersOfTheTopCastSection() {
        GenericPages.homepage.enterTextInSearchInput("QA");
        GenericPages.homepage.openFirstMovieFromSearchSuggestions();
        GenericPages.moviePage.openMovieCastPage();
        List<String> movieCast = GenericPages.movieCastPage.getMovieCast();
        movieCast.subList(0, 5).forEach(System.out::println);
    }
}