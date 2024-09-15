package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementConcept {
    public static WebDriver driver;
    public static void main(String[] args) {

        // create a webelemet + perform thge action ( click , send keys , isDisplayed)
        driver = new FirefoxDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
//        driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']")).sendKeys("9897451904");


        //2.
//        WebElement loginClick = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
//        WebElement phone = driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']"));
//        loginClick.click();
//        phone.sendKeys("9897451904");

        //3, By creating By locator
//        By loginButton = By.xpath("//span[normalize-space()='Login']");
//        By phoneNum = By.cssSelector("input[class='r4vIwl BV+Dqf']");
//
//        WebElement logbu = driver.findElement(loginButton);
//        WebElement phoneN = driver.findElement(phoneNum);
//
//        logbu.click();
//        phoneN.sendKeys("98978451904");

        //4.By Locators + Generic function for elements
//        By loginButton = By.xpath("//span[normalize-space()='Login']");
//        By phoneNum = By.cssSelector("input[class='r4vIwl BV+Dqf']");
//        getElement(loginButton).click();
//        getElement(phoneNum).sendKeys("9897451904");


        //5/ By locators + genric function and also creating generic function for sendkeys and click
        By loginButton = By.xpath("//input[@id='input-email']");
        By password = By.xpath("//input[@id='input-password']");
        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSendKeys(loginButton,"piyush.wadhwa.703@gmail.com");
        eleUtil.doSendKeys(password,"password123454");

        //6.By locators and + generic functions + send keys : Maintain them in ElementUtil


    }
//    public static void doClick( By loctor){
//        getElement(loctor);
//    }
//    public static void doSendKeys(By loctor, String value){
//        getElement(loctor).sendKeys(value);
//    }
//    public static  WebElement getElement( By locator){// this is the generic function
//        return driver.findElement(locator);// here we are using or hitting the sever only once not mutiple times as in prior approcahes
//    }



}
