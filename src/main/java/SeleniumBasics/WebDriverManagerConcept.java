package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManagerConcept
{
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.apple.com/in/");
        String title =driver.getTitle();
        System.out.println("The title of the page is :"+ title);
        driver.quit();



    }
}
