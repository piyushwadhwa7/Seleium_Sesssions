package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public class ElementUtil {
    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    private void nullCheck(String value) {
        if (value == null) {
            throw new ElementException("value is null" + value);
        }
    }

    public void doClick(By loctor) {

        getElement(loctor).click();
    }

    public void doSendKeys(By loctor, String value) {
        nullCheck(value);
        getElement(loctor).sendKeys(value);
    }

    public WebElement getElement(By locator) {// this is the generic function
        try {
            WebElement element = driver.findElement(locator);
            return element;// here we are using or hitting the sever only once not mutiple times as in prior approcahes
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present on the page ... " + locator);
            e.printStackTrace();
            return null;
        }
    }

    public String doGetText(By locator) {
        return getElement(locator).getText();

    }
    public String doGetAttribute( By locator, String name){
        return getElement(locator).getAttribute(name);
    }
}
