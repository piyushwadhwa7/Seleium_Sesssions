package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {

    /**
     * Htmltag= Select tag
     * Selct class in selenium
     */
    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales/");

        By country = By.id("Form_getForm_Country");
        By employees = By.id("Form_getForm_NoOfEmployees");

        //Select select_country = new Select(driver.findElement(country));// 1- select objects
        //select_country.selectByIndex(5);
        /**A
         * Avoid the index as this is risky because the index can be changed by addition of new dropdown value
         * Use this when values are constant like months , years etc
         */
        //select_country.selectByVisibleText("Belgium");
        //select_country.selectByValue("Andorra");// give attribute value

        //Select select_employee= new Select(driver.findElement(employees));//2-select objects
        //select_employee.selectByVisibleText("76 - 100");
        //driver.quit();
        doSelectByIndex(country,5);
        doSelectByText(employees,"76 - 100");


    }

    /**
     * So as we have to create sepoerate object for selectr class every time so we can
     * create a generic function
     */
    public static  WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public static void doSelectByIndex(By locator , int index){
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public static  void doSelectByText(By locator , String Text){
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(Text);
    }
    public static  void doSelectByValue(By locator , String value){
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }


}
