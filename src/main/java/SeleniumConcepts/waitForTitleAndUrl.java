package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitForTitleAndUrl {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/");
        By pricing = By.linkText("Pricing");
        ElementUtil eutil = new ElementUtil(driver);
        eutil.clickWhenReady(pricing, 10);
        String title = waitForTitleContains("Pricing", 10);
        System.out.println(title);
        String url = waitForUrlContains("pricing.html", 10);
        System.out.println(url);
        driver.quit();

    }

    /**
     * This method will wait for the title to be matched with the given titleFraction
     * and returns the title if the condition is met within the given timeout
     * @param titleFraction
     * @param timeOut
     * @return
     */
    public static String waitForTitleContains( String titleFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
                return driver.getTitle();
            }

        }catch (TimeoutException e) {
            System.out.println("title not matched");
        }
        return driver.getTitle();
    }
    /**
     * This method will wait for the title to be matched with the given titleValue
     * and returns the title if the condition is met within the given timeout
     * @param titleValue
     * @param timeOut
     * @return
     */

    public static String waitForTitleToBe( String titleValue, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.titleContains(titleValue))) {
                return driver.getTitle();
            }

        }catch (TimeoutException e) {
            System.out.println("title not matched");
        }
        return driver.getTitle();
    }

    public static String waitForUrlContains( String UrlFraction, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            if (wait.until(ExpectedConditions.urlContains(UrlFraction))) {
                return driver.getCurrentUrl();
            }

        }catch (TimeoutException e) {
            System.out.println("URL not matched");
        }
        return driver.getCurrentUrl();
    }
}
