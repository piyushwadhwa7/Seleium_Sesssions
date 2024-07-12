package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownOptionsWithoutSelectClass {
     static WebDriver driver;


    public static void main(String[] args) {
        /**
         * 1.Select a value from dropdown without using select class methods: By index , By visibletext , by value
         * 2.Also without using the select class
         */


        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales/");

        By country = By.id("Form_getForm_Country");
        By employees = By.id("Form_getForm_NoOfEmployees");

//        Select select_country = new Select(driver.findElement(country));
//        List<WebElement> country_options= select_country.getOptions();
//        for (WebElement e: country_options){
//            String text= e.getText();
//            if (text.equals("Bermuda")){
//                e.click();
//                break;
//            }
//        }
        selectValueFromDropdown(country,"Bermuda");

        /**
         * Here we have not used any select class for the fethcing all count of the country dropodwn options
         */

        By countryOptions= By.xpath("//Select[@id='Form_getForm_Country']/option");
        selectDropdownValueWithoutSelect(countryOptions,"Chile");




    }



    public static  WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    /**
     * Selects a value from a dropdown without using index, value, or visible text.
     *
     * @param locator The locator of the dropdown element.
     * @param optionText The text of the option to be selected.
     */
    public static void selectValueFromDropdown(By locator, String optionText) {
        // Get the dropdown element
        Select selectCountry = new Select(getElement(locator));

        // Get all the options of the dropdown
        List<WebElement> optionsList = selectCountry.getOptions();

        // Iterate over the options and find the one with the matching text
        for (WebElement e : optionsList) {
            String text = e.getText();
            if (text.trim().equals(optionText.trim())) {
                // Click on the option to select it
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

    public static void selectDropdownValueWithoutSelect(By locator, String optionText){
        List<WebElement> optionList=driver.findElements(locator);
        for ( WebElement e: optionList){
            String text=e.getText();
            if (text.equals(optionText)){
                e.click();
                break;
            }
        }
    }
}
