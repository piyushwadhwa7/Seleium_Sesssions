package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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


    //***************************** Select dropdownUtils*********//
    /**
     * Tag name should be selecttag
     */
    public  void doSelectByIndex(By locator , int index){
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public void doSelectByText(By locator , String Text){
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(Text);
    }
    public void doSelectByValue(By locator , String value){
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    /**
     * This is for fetching the dropdown text and count
     * @param locator
     * @return size ( count of the dropdown options)
     */

    public  int getDropdownCount(By locator){
        Select select = new Select(driver.findElement(locator));
        return select.getOptions().size();
    }

    /**
     * This is how we can fetch the options visible in the dropdown in an String Array
     * @param locator
     * @return List< String ></>
     */
    public  List<String> getDropdownOptionsText(By locator){
        Select select = new Select(driver.findElement(locator));
        List<WebElement> optionsList= select.getOptions();
        List<String>optionsTextList= new ArrayList<String>();// this is topcasting
        for (WebElement e: optionsList){
            String text=e.getText();
            optionsTextList.add(text);
        }
        return optionsTextList;

    }

    /**
     * Create a generic code for selecting the value from dropdown without using index, value and visibletext
     * @param locator
     * @param optionText
     */
    public void SelectValueFromDropdown(By locator , String optionText ){
        Select select_country = new Select(getElement(locator));
        List<WebElement> optionsList= select_country.getOptions();
        for (WebElement e: optionsList){
            String text= e.getText();
            if (text.equals(optionText.trim())){
                e.click();
                break;
            }
        }
    }

    /**
     * Genric method to fetch the value from dropdown and click on it without using the Select tag
     * @param locator
     * @param optionText
     */

    public void selectDropdownValueWithoutSelect(By locator, String optionText){
        List<WebElement> optionList=getElements(locator);
        for ( WebElement e: optionList){
            String text=e.getText();
            if (text.equals(optionText)){
                e.click();
                break;
            }
        }
    }


}


