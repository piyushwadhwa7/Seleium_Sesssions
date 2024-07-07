package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class ElementIsDisplayed {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//        boolean flag =driver.findElement(By.id("input-email")).isDisplayed();
//        System.out.println(flag);

        By emailId= By.id("input-email");

        if (doIsDisplayed(emailId)){
            System.out.println("PASS");
        }
//        List<WebElement> emailIdList= driver.findElements(emailId);
//        if (emailIdList.size()==1){
//            System.out.println(" Email id is present one time on the page ");
//        }else {
//            System.out.println("email id is coming more then one time");
//        }
        System.out.println(isElementDisplayed(emailId,1));

        By forgotPassword= By.linkText("Forgotten Password");
        System.out.println(isElementDisplayed(forgotPassword,2));
        driver.quit();


}
public static WebElement getElement(By locator){

        return driver.findElement(locator);
}

public static boolean doIsDisplayed( By locator) {
    try {
        boolean flag = getElement(locator).isDisplayed();
        System.out.println("element is displayed: " + locator);
        return flag;
    } catch (NoSuchElementException e) {
        System.out.println(" element with locator" + locator + " is not dispayed");
        return false;
    }
}

public static boolean isElementDisplayed(By locator, int expectedElementCount){
         int elementCount=driver.findElements(locator).size();
         if (elementCount==expectedElementCount){
             System.out.println(" single element is displayed:  "+ locator+ " with the occurence of " + elementCount);
             return true;
         }else {
             System.out.println(" Multiple or No elememts are displayed: " + locator);
             return false;
         }
}




}
