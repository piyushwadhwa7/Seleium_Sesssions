package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {
    @Test(description = "Checking  Page Title....",priority = 1)
    public void PagetitleTest() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Account Login", "Title not matched");// custom error message
    }
    @Test(description = "Checking  Page Url....",priority = 2)
    public void PageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("route=account/login"), "Url not matched");// custom error message
    }
}
