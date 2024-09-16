package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class WebDriverWaitFluentFeatures {
    static WebDriver driver;

    public static void main(String[] args) {
        // Wait( Interface)--until
        //           --> imp by FluentWait ( C ) - until (){} + ind method{}
        //                          --> extended by WebdriverWait ( C ) no methods all are inherited from fluent wait

        //So for third party inplimentataion they have provided very important class which is called fluent wait through which new
        // thrird party can extends all the method of fluent wait and create their own wait and create low level of object

        driver=new ChromeDriver();
        driver.get("https://classic.crmpro.com/");
        By pricingLink=By.linkText("Pricing");
        //default polling time in selenium is 500ms and we can customise it and give our polling time
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2))
                //.ignoreAll(NoSuchElementException.class)
                .withMessage("===element is not found===");

        wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink)).click();
    }
}
