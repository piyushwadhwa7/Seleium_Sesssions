package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * Checks if the given value is null and throws an ElementException if it is.
     *
     * @param  value  the value to be checked
     * @throws ElementException  if the value is null
     */
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


    /**
     * This method is used for finding a element on page is displayed or not
     * @param locator
     * @return a boolean value : True or false
     */
    public  boolean doIsDisplayed( By locator) {
        try {
            boolean flag = getElement(locator).isDisplayed();
            System.out.println("element is displayed: " + locator);
            return flag;
        } catch (NoSuchElementException e) {
            System.out.println(" element with locator" + locator + " is not dispayed");
            return false;
        }
    }

    //***************************** Action class*********//
    /**
     * Handles the parent-child menu interaction by hovering over the parent element and clicking on the child element.
     *
     * @param  parentLocator  the locator for the parent element
     * @param  childLocator   the locator for the child element
     * @throws InterruptedException  if the thread is interrupted while sleeping
     */
    public  void handelParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(getElement(parentLocator)).perform();
        Thread.sleep(2000);
        doClick(childLocator);
        //driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
    }

    /**
     * Drag and drop
     * @param sourceLocator
     * @param targetLocator
     * @throws InterruptedException
     */
    public void dragAndDrop(By sourceLocator, By targetLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.clickAndHold(getElement(sourceLocator)).moveToElement(getElement(targetLocator)).release().perform();
    }

    /**
     * This is used to click on the element same as DoClick but more effective
     * We can use both of these when we are getting ElementNotInteractableException
     * @param locator
     * @param value
     */
    public void ActionDoClick(By locator, String value) {
        Actions act = new Actions(driver);
        act.click(getElement(locator)).perform();
    }

    /**
     * This is used same as sendkeys but more effective
     * @param locator
     * @param value
     */
    public  void ActionSendKeys(By locator, String value) {
        Actions act = new Actions(driver);
        act.sendKeys(getElement(locator), value).perform();
    }
    /**
     * This is also a good example of method overloading
     * This can be used in any type of multilevel menue
     * This is ,ore efficient and can be used for any type of multilevel menue
     * @param level1
     * @param level2
     * @param level3
     * @param level4
     * @throws InterruptedException
     */
    public  void MultilevelMenue(By level1, String level2, String level3, String level4) throws InterruptedException {
        doClick(level1);
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(getElement(By.linkText(level2))).perform();
        Thread.sleep(2000);
        act.moveToElement(getElement(By.linkText(level3))).perform();
        Thread.sleep(2000);
        doClick(By.linkText(level4));
        driver.quit();

    }

    //***************************** Wait Utils*****************//
    /**
     * This method is used to wait for the presence of the element on the page
     * This does not neccessarily mean that the element is visible
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     * @return WebElement
     */
    public  WebElement waittForElementPresence(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }
    /**
     * This method is used to wait for the visibility of the element on the page
     * This means that the element is not only displayed but also has height and widhth greater than 0
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     * @return WebElement
     */
    public  WebElement waittForElementVisisble(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    /**
     * This method is used to click on the element after waiting for the visibility of the element on the page
     * This means that the element is not only displayed but also has height and widhth greater than 0
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     */
    public void doClickWithWait( By locator, int timeOut) {
        waittForElementVisisble(locator, timeOut).click();
    }
    /**
     * This method is used to send the keys to the element after waiting for the visibility of the element on the page
     * This means that the element is not only displayed but also has height and widhth greater than 0
     * @param loctor : By locator of the element
     * @param value : string value to be sent
     * @param timeOut : in seconds
     */
    public void doSendKeys(By loctor, String value , int timeOut) {
        nullCheck(value);
        waittForElementVisisble(loctor, timeOut).sendKeys(value);
    }

    /**
     * This method is used to click on the element after waiting for the visibility of the element on the page
     * This means that the element is not only displayed but also has height and widhth greater than 0
     * @param locator : By locator of the element
     * @param timeOut : in seconds
     */
    public void clickWhenReady(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }


}


