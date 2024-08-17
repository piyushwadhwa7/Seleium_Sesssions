package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();//browser
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");//page DOM V1
        WebElement emailID=driver.findElement(By.xpath("//input[@id='input-firstname']"));//V1
        emailID.sendKeys("Selenium");//V1
        driver.navigate().refresh();
        //This email ID is from V1 itself
        emailID=driver.findElement(By.xpath("//input[@id='input-firstname']"));//V2 DOM
        emailID.sendKeys("automation tool");//staleElementException
        driver.quit();
        // so dont take refresh in between the script or elements creation

        //v1 emailid =f.05CBCE06380AABD3F8B330510626F9DA.d.11342B896121EF3B599D01F574885C29.e.5
        //v2 emailid =f.05CBCE06380AABD3F8B330510626F9DA.d.96E639FE2CE3642A6BAAC1B320AB5525.e.58
        //Thats the reason we should always go for By locator approach not creating webelement approach

    }


}
