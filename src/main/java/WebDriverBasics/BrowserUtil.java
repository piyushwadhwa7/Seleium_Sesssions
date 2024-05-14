package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
    WebDriver driver;

    public WebDriver launchBrowser( String browserName){
        System.out.println(" the browser name : "+ browserName);

        switch(browserName.trim().toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println(" please pass the right browser"+ browserName);
                throw new BrowserException(" Invalid Browser"+ browserName);
        }
        return driver;
    }

    /**
     *  we are using BrowserException so that we can use our own custom exceptions
     */
    public void launchURL(String  url ){
        if (url==null){
            throw new BrowserException(" invalid url"+ url);
        }
        if (url.isBlank() || url.isEmpty()){
            throw new BrowserException(" Blank / Empty url..."+ url);

        }
        if (url.indexOf("http")!=0 ){
            throw new BrowserException(" https is missing  "+ url);

        }
        driver.get(url.trim());
    }

    public String getPageTitle(){
        String title = driver.getTitle();
        if (title==null){
            System.out.println(" getting null titile ...");
            return null;

        }
        return title;
    }
    public String getPageCurrentUrl(){
        return driver.getCurrentUrl();

    }

    public void quitBrowser(){
        driver.quit();
    }
}
