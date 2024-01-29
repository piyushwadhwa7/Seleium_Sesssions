package SeleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleiumTopcasting {
    public static void main(String[] args) {
        //1.chrome/firefox/safari/edge
        //valid
        //ChromeDriver driver = new ChromeDriver();

        //2. webdriver - CD
        // This is used when we are running the test locally
        //valid

//        WebDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new SafariDriver();
//        driver = new EdgeDriver();


//        //3. searchCotext valid but ot useful
//        SearchContext driver = new ChromeDriver();
//        // bcz oly limited methods are available

        //4. RemoteWebdriver valid and useful
        //RemoteWebDriver driver = new SafariDriver();


        //5. WD - Remote WD
        // To run the test on remote machine-- cloud , server, grid ,AWS
       // WebDriver driver = new RemoteWebDriver();


    }
}
