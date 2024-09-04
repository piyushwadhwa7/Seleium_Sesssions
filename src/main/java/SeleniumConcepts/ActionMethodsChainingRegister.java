package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodsChainingRegister {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        WebElement firstName= driver.findElement(By.id("input-firstname"));
        Actions act=new Actions(driver);
        act.sendKeys(firstName, "naveen")
                .sendKeys(Keys.TAB)
                .pause(2000)
                .sendKeys("kumar")
                .sendKeys(Keys.TAB)
                .pause(2000)
                .sendKeys("Piyush.wadhwa.703@gmail.com")
                .sendKeys(Keys.TAB)
                .pause(2000)
                .sendKeys("9897451904")
                .sendKeys(Keys.TAB)
                .pause(2000)
                .sendKeys("naveen@123")
                .sendKeys(Keys.TAB)
                .pause(2000)
                .sendKeys("naveen@123")
                .sendKeys(Keys.TAB)
                .pause(1000)
                .sendKeys(Keys.TAB)
                .pause(1000)
                .sendKeys(Keys.TAB)
                .pause(1000)
                .sendKeys(Keys.SPACE)
                .pause(1000)
                .sendKeys(Keys.TAB)
                .pause(1000)
                .sendKeys(Keys.ENTER)
                .build().perform();
        driver.quit();


    }
}
