package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
    WebDriver driver;
    /*
    * This method is used to initialize the browser based on the browser name
    * */
     public void lanchBrowser(String browser){
         System.out.println("Browser name is : " + browser);
         switch (browser.toLowerCase()){
             case "chrome":
                 //System.setProperty("webdriver.chrome.driver", "/Users/piyushwadhwa/downloads/chromedriver_mac64/chromedriver");
                 WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
                 break;
             case "firefox":
                 //System.setProperty("webdriver.gecko.driver", "/Users/piyushwadhwa/downloads/geckodriver 2");
                 WebDriverManager.firefoxdriver().setup();
                 driver =new FirefoxDriver();
                 break;
             case "safari":
                 WebDriverManager.safaridriver().setup();
                 driver = new SafariDriver();
                 break;
             case "edge":
                 //System.setProperty("webdriver.edge.driver", "/Users/piyushwadhwa/downloads/msedgedriver");
                 WebDriverManager.edgedriver().setup();
                 driver = new EdgeDriver();

             default:
                 System.out.println("please pass the correct browser path");
                 break;
         }

     }

     public void launchUrl(String url) throws Exception {
         if(url.length()==0) {
             System.out.println("url is blank");
             throw new Exception("URLBLANKEXECPTION");
         }

         if(url == null){
             System.out.println("URL IS BLANK");
             throw new Exception("URLISNULL");
         }

             driver.get(url);
         }

         /*
         * now we will see a WRAPPER FUNCTION
         * Here getPgeTitle is a wrapper function as driver.getTitle() is wrapped under a mehtod called getTitle*/

     public String getPageTitle(){
         String title = driver.getTitle();
         System.out.println(" Page tite is :"+ title);
         if(title!=null){
             return title;
         }
         else{
             System.out.println("TITLE NOT PRESENT");
             return null;
         }


     }
     public String getPageURL(){
         String url = driver.getCurrentUrl();
         System.out.println(" Page url is :"+ url);
         if(url!=null){
             return url;
         }
         else {
             System.out.println("TITLE NOT PRESENT");
             return null;
         }
     }
     public void closeBrowser(){
         if(driver!=null){
             driver.close();
             System.out.println("BROWSER IS CLOSED");
         }
     }
    public void quitBrowser(){
        if(driver!=null){
            driver.quit();
            System.out.println("BROWSER IS CLOSED");
        }
    }
    public void MaximiseWindow(){
         driver.manage().window().maximize();
    }

}

