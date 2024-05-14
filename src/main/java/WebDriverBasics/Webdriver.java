package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver  {

    public static void main(String[] args) {
        //java + selenium code ( 4.x)
        //open the browser

        WebDriver driver = new ChromeDriver();

        /**
         * Entering the URL
         */
        driver.get("https://www.udemy.com/");
        /**
         * Gettign the Title
         */
        String title=driver.getTitle();
        System.out.println("Page Title: " + title);
        if (title.equals("Online Courses - Learn Anything, On Your Schedule | Udemy")){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is not correct");
        }

        /**
         * Getting the URL
         */
        String url=driver.getCurrentUrl();
        System.out.println(url);
        if (url.contains("udemy.com")){
            System.out.println("url is correct");
        }
        else {
            System.out.println(" url is not correct ");
        }

        /**
         * Closing the browser
         */
        //driver.close();
        driver.quit();
        //driver.getTitle();in this case will get exception as ID IS NULL

        /**
         * Automation steps + validation = AUTOMATION TESTING
         */


    }
}
