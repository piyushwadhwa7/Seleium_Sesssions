package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class naigationConcept {
    //go to url
    // back
    //  forward
    // refresh
    /**
     * Selenium is using w3c( World web consortium )nb   standards for all his methods
     */

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        driver = new ChromeDriver();
        driver.get("https://www.dailyobjects.com/");
        //driver.navigate().to(new URL("https://www.dailyobjects.com/"));
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();// daily objects
        System.out.println(driver.getTitle());
        driver.navigate().forward();// flipcart
        System.out.println(driver.getTitle());
        driver.navigate().back();//daily objects
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
    }
}
