package MyTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreeCodeCampTest extends BaseTest {
    @Test(description = "Checking  Page Title....")
    public void PagetitleTest() {
        driver.get("https://www.freecodecamp.org/news/api-testing-with-postman-a-step-by-step-guide-using-the-spotify-api/");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "API Testing with Postman: A Step-by-Step Guide Using the Spotify API", "Title not matched");// custom error message
    }
    @Test(description = "Checking  Page Url....",priority = 1)
    public void PageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("api-testing-with-postman-a-step-by-step-guide-using-the-spotify-api"), "Url not matched");// custom error message
    }
}
