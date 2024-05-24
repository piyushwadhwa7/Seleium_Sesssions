package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
    private WebDriver driver;

    public ElementUtil(WebDriver driver){
        this.driver= driver;
    }

    public  void doClick( By loctor){
        getElement(loctor);
    }
    public  void doSendKeys(By loctor, String value){
        getElement(loctor).sendKeys(value);
    }
    public  WebElement getElement(By locator){// this is the generic function
        try {
            WebElement element = driver.findElement(locator);
            return element;// here we are using or hitting the sever only once not mutiple times as in prior approcahes
        }catch (NoSuchElementException e){
            System.out.println("Element is not present on the page ... "+ locator);
            e.printStackTrace();
            return null;
        }

    }
}
