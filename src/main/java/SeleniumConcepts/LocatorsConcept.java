package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


        // create a webelemet + perform thge action ( click , send keys , isDisplayed)
        //1.By.Id
        By username= By.id("input-email");
        By password = By.id("input-password");

        ElementUtil util = new ElementUtil(driver);
        //util.doSendKeys(username,"piyushwadhwa@123.com");
        //util.doSendKeys(password,"password12345");


        //2.Ny.Name
        driver.findElement(By.name("email")).sendKeys("piyushwadhwa123@gmail.com");

        //3.By.className
        driver.findElement(By.className("form-control")).sendKeys("piyushwadhwa123@gmail.com");
        // a developer can defined mutiple classes
        // ClassName is used  for look and feel of the page

        //4.Xpath= Its not an attribute , its address of element in html dom
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("piyush.wadhwa123@gmail.com");

        //5.CssSelector: Its not an attribute ,
        driver.findElement(By.cssSelector("#input-email")).sendKeys("Piyush123@gmail;.com");
        driver.findElement(By.cssSelector("#input-password")).sendKeys("password123");
        driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

        //6.LinkText : Only for the links <a> , its also not an attribute
        driver.findElement(By.linkText("Register")).click();

        //7.Partial Linktext
        driver.findElement(By.partialLinkText("Delivery")).click();

        //8.tagName: html tag
        String header = driver.findElement(By.tagName("h2")).getText();
        System.out.println(header);
    }
}
