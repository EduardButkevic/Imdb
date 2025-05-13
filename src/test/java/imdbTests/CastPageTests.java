package imdbTests;

import imdbPages.GenericPages;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.List;

public class CastPageTests extends BaseTest {

    @Test
    @Description("Print out 5 members of the top cast section")
    public void printOut5MembersOfTheTopCastSection() {
        GenericPages.homepage.enterTextInSearchInput("QA");
        GenericPages.homepage.openFirstMovieFromSearchSuggestions();
        GenericPages.moviePage.openMovieCastPage();
        List<String> movieCast = GenericPages.movieCastPage.getMovieCast();
        movieCast.subList(0, 5).forEach(System.out::println);
    }
}