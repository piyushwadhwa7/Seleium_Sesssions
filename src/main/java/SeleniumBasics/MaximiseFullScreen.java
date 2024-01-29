package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximiseFullScreen {

    public static void main(String[] args) throws Exception {
//        String browser = "firefox";
//        BrowserUtil butil = new BrowserUtil();
//        butil.MaximiseWindow();
//        butil.launchUrl("https://www.apple.com/in/");
//        butil.closeBrowser();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/in/");
        driver.close();

    }

}
