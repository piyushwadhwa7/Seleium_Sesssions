package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class quitvsclosesessionid
{
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/piyushwadhwa/downloads/geckodriver");
        WebDriver driver=new FirefoxDriver(); // top casting concept //123 session id
        driver.get("https://www.amazon.in/ref=nav_logo");//123
        String title = driver.getTitle();//123
        System.out.println("Page Title : "+ title);//123

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
         * In quit SessionId is Null , whereas in Close SessionID is invalid means ( Same sessionID but invalid as it gets expired)
         */
        driver.quit();//123
        //null
        driver = new FirefoxDriver();//456
        driver.get("https://www.amazon.in/ref=nav_logo");//456,
        System.out.println(driver.getTitle());//NoSuchSessionExecption - Session is null
    }
}
