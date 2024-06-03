package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();//123
        ElementUtil util = new ElementUtil(driver);
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        //driver.findElement(By.linkText("Forgotten Password")).click(); we can create generic function elemntuitl for click
        By forgotpswdLink = By.linkText("Forgotten Password");
        By loginLink = By.linkText("Login");
        util.doClick(forgotpswdLink);
        util.doClick(loginLink);

        driver.quit();
    }
}
