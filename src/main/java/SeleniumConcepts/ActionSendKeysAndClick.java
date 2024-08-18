package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysAndClick {
//input[@name='firstname']

    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        By userName= By.xpath("//input[@name='firstname']");
        Actions act = new Actions(driver);
        act.sendKeys(driver.findElement(userName), "naveen").perform();
        act.click(driver.findElement(By.linkText("Forgotten Password"))).perform();


    }

    public static void ActionDoClick(By locator, String value) {
        Actions act = new Actions(driver);
        act.click(driver.findElement(locator)).perform();
    }
    public static void ActionSendKeys(By locator, String value) {
        Actions act = new Actions(driver);
        act.sendKeys(driver.findElement(locator), value).perform();
    }

}
