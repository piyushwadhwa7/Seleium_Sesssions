import WebDriverBasics.BrowserUtil;
import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    public static void main(String[] args) {
        BrowserUtil brutil = new BrowserUtil();
        WebDriver driver= brutil.launchBrowser("firefox");
        brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        System.out.println(brutil.getPageTitle());
        System.out.println(brutil.getPageCurrentUrl());
        By loginButton = By.xpath("//input[@id='input-email']");
        By password = By.xpath("//input[@id='input-password']");
        ElementUtil eleutil = new ElementUtil(driver);
        eleutil.doSendKeys(loginButton,"piyush.wadhwa123@gmail.com");
        eleutil.doSendKeys(password,"password12345");
        driver.quit();
    }
}
