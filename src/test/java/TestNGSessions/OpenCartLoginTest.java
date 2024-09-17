package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenCartLoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }
    @Test(description = "Checking Login Page Title....")
    public void loginPagetitleTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Account Login", "Title not matched");// custom error message
    }
    @Test(description = "Checking Login Page Url....")
    public void loginPageUrlTest() {
        String Url = driver.getCurrentUrl();
        System.out.println("Page Url is: " + Url);
        Assert.assertTrue(Url.contains("route=account/login"), "Url not matched");// custom error message
    }
    @Test(description = "Checking Login Page Logo....")
    public void LoginPageLogoTest() {
        boolean flag=driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
        Assert.assertEquals(flag,true,"Logo is not displayed");
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
