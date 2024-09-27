package MyTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JioCinema extends BaseTest{
    @Test(description = "Checking  Page Url....")
    public void PageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("https://www.jiocinema.com/"), "Url not matched");// custom error message
    }
    @Test(description = "Checking  Page Title....")
    public void PagetitleTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "JioCinema - Watch Sports, Movies, Web Series, TV Online in HD Quality", "Title not matched");// custom error message
    }

}
