package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickWithWait {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/");
        By signup = By.linkText("Sign Up");
        ElementUtil eutil = new ElementUtil(driver);
        eutil.clickWhenReady(signup, 10);
        driver.quit();

    }
}
