package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {
    @Test(description = "Checking  Page Title....")
    public void PagetitleTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Account Login", "Title not matched");// custom error message
    }
    @Test(description = "Checking  Page Url....")
    public void PageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("route=account/login"), "Url not matched");// custom error message
    }
}
