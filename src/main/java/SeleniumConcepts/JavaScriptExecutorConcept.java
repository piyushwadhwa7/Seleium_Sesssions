package SeleniumConcepts;

import WebDriverBasics.JavaScriptUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // Javascript Executor--Interface--method ( excrute script)
        //Remote web driver -- internally calls Javascript Executor
        //Remote web driver--internally also calls Webdriver
        // To execute javascript on the browser we use JS
        driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login/?hubs_signup-url=knowledge.hubspot.com%2Faccount-management%2Fwhy-can-t-i-log-into-hubspot&hubs_signup-cta=cta_button");
//        JavascriptExecutor js = (JavascriptExecutor) driver;// we have done type casting to parent elememt and converted to driver into JavascriptExecutor
//        String title = (String) js.executeScript("return document.title;");// we are converting javascript string to java string here
//        System.out.println(title);
        JavaScriptUtil jsutil = new JavaScriptUtil(driver);
        String pageTitle = jsutil.getTitleByJs();
        Thread.sleep(3000);
        System.out.println(pageTitle);
        String pageURL = jsutil.getURLByJs();
        System.out.println(pageURL);
//        String pageText=jsutil.getPageInnerText();
//        System.out.println(pageText.contains("Sign Up"));//this we can use when we need to verify particular text is present without creating too many Webelements
        //jsutil.scrollPageDown(); // TO SCROLL DOWN TO PAGE
        WebElement loginForm=driver.findElement(By.id("hs-login"));
        jsutil.drawBorder(loginForm);// This will highlight the element
        WebElement emailField=driver.findElement(By.id("username"));
        jsutil.flash(emailField);// This will highlight the element background with color code
        //driver.quit();
    }

}
