package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementConceptWithException {
    static WebDriver driver;

    public static void main(String[] args) {

        // create a webelemet + perform thge action ( click , send keys , isDisplayed)
        driver = new FirefoxDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        try{
            driver.findElement(By.id("input-emaill")).sendKeys("piyush@gmail.com");
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }


        //NSE

        driver.findElement(By.id("input-password")).sendKeys("password");// null keys are not allowed
    }
}
