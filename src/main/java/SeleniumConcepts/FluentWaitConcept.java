package SeleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        // Wait( Interface) -- Fluent Wait---  WebdriverWait

        driver=new ChromeDriver();
        driver.get("https://classic.crmpro.com/");
        By pricingLink=By.linkText("Pricing");
        //default polling time in selenium is 500ms and we can customise it and give our polling time
        waitForElementVisible(pricingLink,10,2).click();
    }

    //Create a utility for fluentWait
    /**
     * This method will wait for the element to be visible on the page for the given timeOut.
     * It will poll the element every intervalTime seconds to check if the element is visible.
     * If the element is visible, it will return the element.
     * If the element is not visible after the given timeOut, it will throw an exception
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     * @param intervalTime : in seconds
     * @return WebElement
     */
    public static WebElement waitForElementVisible(By locator, int timeOut, int intervalTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)// child class of wait interface
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(intervalTime))
                .withMessage("===element is not found===");// This is a builder pattern
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * This method will wait for the element to be present on the page for the given timeOut.
     * It will poll the element every intervalTime seconds to check if the element is present.
     * If the element is present, it will return the element.
     * If the element is not present after the given timeOut, it will throw an exception
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     * @param intervalTime : in seconds
     * @return WebElement
     */

    public static WebElement waitForElementPresenceVisible(By locator, int timeOut, int intervalTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(intervalTime))
                .withMessage("===element is not found===");// This is a builder pattern
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
