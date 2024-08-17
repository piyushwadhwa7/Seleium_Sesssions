package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        By Mobiles= By.xpath("//span[text()='Mobiles']");
        ElementUtil etl= new ElementUtil(driver);
        etl.doClick(Mobiles);
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement targetEle= driver.findElement(By.cssSelector(".iToJ4v.D0puJn"));
        WebElement sourceEle=driver.findElement(By.cssSelector(".iToJ4v.Kaqq1s"));
        Thread.sleep(2000);
        act.clickAndHold(sourceEle).moveToElement(targetEle).release().perform();


    }
    public static void dragAndDrop(By sourceLocator, By targetLocator) throws InterruptedException {
        WebElement targetEle= driver.findElement(By.cssSelector(".iToJ4v.D0puJn"));
        WebElement sourceEle=driver.findElement(By.cssSelector(".iToJ4v.Kaqq1s"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.clickAndHold(sourceEle).moveToElement(targetEle).release().perform();
    }
}
