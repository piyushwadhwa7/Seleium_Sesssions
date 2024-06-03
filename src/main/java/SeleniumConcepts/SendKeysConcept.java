package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


        // create a webelemet + perform thge action ( click , send keys , isDisplayed)
        //1.By.Id
        //By username = By.id("input-email");
        //By password = By.id("input-password");
        String name = "naveen";
        String desg = " SDET";

       driver.findElement(By.id("input-email")).sendKeys(name,desg);//send keys is taking an charcater array type and its coming from java
    }
}
