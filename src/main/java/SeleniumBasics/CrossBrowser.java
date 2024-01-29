package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
    static WebDriver driver;
    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "/Users/piyushwadhwa/downloads/geckodriver");
//        WebDriver driver=new FirefoxDriver(); // top casting concept
//        driver.get("https://www.amazon.in/ref=nav_logo");
//        String title = driver.getTitle();
//        System.out.println("Page Title : "+ title);
//        driver.quit();

        String browser = "EDGE";
        switch (browser.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/piyushwadhwa/downloads/chromedriver_mac64/chromedriver");
                driver=new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/piyushwadhwa/downloads/geckodriver");
                driver =new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "/Users/piyushwadhwa/downloads/msedgedriver");
                driver = new EdgeDriver();

            default:
                System.out.println("please pass the correct browser path");
                break;
        }
        driver.get("https://www.amazon.in/ref=nav_logo");
        String title = driver.getTitle();
        System.out.println("Page Title : "+ title);
        driver.quit();
    }
}
