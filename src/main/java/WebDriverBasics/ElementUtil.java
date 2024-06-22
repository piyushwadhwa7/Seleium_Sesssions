package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

import java.util.ArrayList;
import java.util.List;

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


    public  List<WebElement> getElements(By locator ){
        return driver.findElements(locator);
    }
    public  int getElementsCount(By locator){
        return getElements(locator).size();
    }


    /**
     * WAF: To fetch the text oif each link and store it in some list and return
     * @param locator
     * @return List<String>
     */
    public  List<String> getElementsListText(By locator){
        List<WebElement> elelist = getElements(locator);// creating an empty list here
        List<String> eleTextList = new ArrayList<String>();
        for (WebElement e: elelist){
            String text = e.getText();
            if (text.length()!=0){
                eleTextList.add(text);// And when one by one we are fetching the text will add here in array list
            }
        }
        return eleTextList;
    }

    /**
     * WAP: TO fetch the list of attributes from the locators and store in array list and return
     * @param locator
     * @param AttrName
     * @return List<String>
     */

    public  List<String> getElemntsAttributeList (By locator, String AttrName){
        List<WebElement> imagesList = getElements(locator);
        List<String> attrList = new ArrayList<String>();
        for (WebElement e : imagesList) {
            String attrvalue = e.getAttribute(AttrName);
            if (attrvalue != null && attrvalue.length()!=0) {
            }
        }
        return attrList;
    }
}


