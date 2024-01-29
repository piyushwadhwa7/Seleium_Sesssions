package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {
    public static void main(String[] args) {

        // open chrome
        // go to amazon.com
        // get the title
        //verify the title and close
        System.setProperty("webdriver.gecko.driver", "/Users/piyushwadhwa/downloads/geckodriver");
        WebDriver driver=new FirefoxDriver(); // top casting concept
        driver.get("https://www.amazon.in/ref=nav_logo");
        String title = driver.getTitle();
        System.out.println("Page Title : "+ title);

        //Veroficationn point : Actual vs expected
        if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")){
            System.out.println("PASS");

        }
        else {
            System.out.println("FAIL");
        }
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //String source = driver.getPageSource();
        //System.out.println(source);// The fronnt ed source code javascript or dom

        /**
         * how to close the browser : Two methods
         * 1- close
         * 2- quit
         */
        driver.quit();



    }
}
