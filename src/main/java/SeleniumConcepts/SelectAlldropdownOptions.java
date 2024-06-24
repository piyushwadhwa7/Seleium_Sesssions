package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SelectAlldropdownOptions {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales/");
        //ElementUtil eleutil = new ElementUtil(driver);

        By country = By.id("Form_getForm_Country");
        By employees = By.id("Form_getForm_NoOfEmployees");
        //Select select = new Select(driver.findElement(country));
//        List<WebElement> country_options= select.getOptions();
//        System.out.println(country_options.size());
//        for (WebElement e: country_options){
//            String text=e.getText();
//            System.out.println(text);
//        }
        List<String> countryList=getDropdownOptionsText(country);
        System.out.println(countryList);
        List<String> employeeList=getDropdownOptionsText(employees);
        System.out.println(employeeList);
        System.out.println(getDropdownCount(country));
        System.out.println(getDropdownCount(employees));

    }

    public static  WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    public static int getDropdownCount(By locator){
        Select select = new Select(driver.findElement(locator));
        return select.getOptions().size();
    }
    public static List<String> getDropdownOptionsText(By locator){
        Select select = new Select(driver.findElement(locator));
        List<WebElement> optionsList= select.getOptions();
        List<String>optionsTextList= new ArrayList<String>();// this is topcasting
        System.out.println(optionsList.size());
        for (WebElement e: optionsList){
            String text=e.getText();
            optionsTextList.add(text);
        }
        return optionsTextList;

    }
}
