package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    static WebDriver driver;

    /**
     * Explcit wait ( I) -Until ();
     * // implimented by fluentwait()--methods()
     * //extende by webdriverwait()
     *
     * @param args
     */
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        By emaiId=By.id("input-email");
        By passwordId=By.id("input-password");
        By loginButton=By.xpath("//input[@value='Login']");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(emaiId));
//        email.sendKeys("piyushwadhwa123@gmail.com");// wait is implimented only for email id
//        //wait.until(ExpectedConditions.presenceOfElementLocated(emaiId));
//        getElement(passwordId).sendKeys("password123");
//        getElement(loginButton).click();
        waittForElementPresence(emaiId,10).sendKeys("piyushwadhwa123@gmail.com");
        getElement(passwordId).sendKeys("password123");
        getElement(loginButton).click();


    }
    /**
     * This method is used to wait for the presence of the element on the page
     * This does not neccessarily mean that the element is visible
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     * @return WebElement
     */
    public static WebElement waittForElementPresence(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
         return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }
        /**
         * This method is used to wait for the visibility of the element on the page
         * This means that the element is not only displayed but also has height and widhth greater than 0
         * @param locator : By locator of the element
         * @param timeOut : in seconds
         * @return WebElement
         */
    public static WebElement waittForElementVisisble(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
