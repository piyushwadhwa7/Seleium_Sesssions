package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        ElementUtil util =new ElementUtil(driver);
        By forgotpswrd= By.linkText("Forgotten Password");
        By emailid= By.id("input-email");
        //String hrefvalue=driver.findElement(forgotpswrd).getAttribute("href");
//        System.out.println(hrefvalue);
//        //String placeholdevalue=driver.findElement(emailid).getAttribute("placeholder");
//        System.out.println(placeholdevalue);
        util.doGetAttribute(forgotpswrd,"href");
        util.doGetAttribute(emailid,"placeholder");

        driver.findElement(emailid).sendKeys("piyush12@gmail.com");
        //String value=driver.findElement(emailid).getAttribute("value");
        String value=util.doGetAttribute(emailid,"value");
        System.out.println(value);
    }
}
