package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElemenetsException {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        //driver.findElement(By.id("input-email111")).sendKeys("piyush@gmail.com");//NSE

        List<WebElement> linkList= driver.findElements(By.id("input-email1111"));
        System.out.println(linkList.size() );

        driver.quit();

    }
}
