package WebDriverBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

    public static void main(String[] args) {

        /**
         * can we top cast chrome diver to Webdriver
         * Yes , valid and must used
         */

        WebDriver driver = new ChromeDriver();

        //2. Valid but not recommended

        SearchContext driver1 = new ChromeDriver();

        //3. Valid and recomended

        RemoteWebDriver driver2 = new ChromeDriver();

        //4. VALID and recomended -- for remote execution ( AWS , CLOUD , SERVER , VM MACHINE )
        //WebDriver driver3= new RemoteWebDriver(remoteAddress, capablities);

    }
}
