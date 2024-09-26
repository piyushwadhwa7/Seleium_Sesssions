package MyTest;
import WebDriverBasics.ElementUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTest extends BaseTest{
    //ElementUtil eutil = new ElementUtil(driver);
    @Test(description = "Checking  Page Title....")
    public void PagetitleTest() {
        driver.get("https://www.google.co.in/");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Google", "Title not matched");// custom error message
    }
    @Test(description = "Checking  Page Url....")
    public void PageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("https://www.google.co.in/"), "Url not matched");// custom error message
    }

}
