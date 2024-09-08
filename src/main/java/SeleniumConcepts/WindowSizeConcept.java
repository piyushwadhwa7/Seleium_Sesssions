package SeleniumConcepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();//upto certain limit
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        Thread.sleep(2000);
        driver.manage().window().minimize();//Added in Selenium 4.0
        Dimension dim = new Dimension(200, 300);
        driver.manage().window().setSize(dim);
        //driver.manage().window().fullscreen();// fullscreen upto current size of screen
        driver.quit();

    }
}
