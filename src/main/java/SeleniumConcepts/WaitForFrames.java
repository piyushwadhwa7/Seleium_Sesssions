package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForFrames {
    static WebDriver driver;
    /**
     * This is the main method of the IFrameHandling class. It initializes a ChromeDriver,
     * navigates to a specific URL, waits for 3 seconds, clicks on an image with a specific title,
     * switches to an iframe with a specific id, enters a text into a text field with a specific id,
     * switches back to the main page, retrieves the text of an element with a specific CSS selector,
     * prints the retrieved text to the console, and finally quits the driver.
     *
     * @param  args  the command line arguments
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds
        By frame = By.xpath("//iframe[contains(@id,'frame-one')]");
        By firstName = By.id("RESULT_TextField-8");
        waitForFrame(frame, 10);
        driver.findElement(firstName).sendKeys("Selenium");
        driver.switchTo().defaultContent();
        String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
        System.out.println(header);
        driver.quit();

    }
    public static void waitForFrame(By frame, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
    }
    public static void waitForFrameByIndex(int frameIndex, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
    }
    public static void waitForFrameByIndex(String FrameIdOrName, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIdOrName));
    }
    public static void waitForFrameByIndex(WebElement FrameElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));
    }


}
