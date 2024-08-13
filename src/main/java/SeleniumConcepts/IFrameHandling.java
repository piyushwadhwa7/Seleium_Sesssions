package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IFrameHandling {
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
        driver=new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
        driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Selenium");
        driver.switchTo().defaultContent();//switch to main page
        String header=driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
        System.out.println(header);
        driver.quit();
    }
}
