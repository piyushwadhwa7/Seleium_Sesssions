package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorException {
    static WebDriver driver;


    /**
     * This is the main method of the InvalidSelectorException class. It initializes a ChromeDriver instance,
     * navigates to a specific URL, and demonstrates different scenarios of invalid selectors, element visibility,
     * and incorrect expressions.
     *
     * @param  args	an array of command-line arguments
     */
    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        //1.invalid selector
        //driver.findElement(By.xpath("//input[@@@id='input-firstname']")).sendKeys("Selenium");
        //javascript error:
        //2.invalid selector
        //driver.findElement(By.cssSelector("//input[@@@id='input-firstname']")).click();
        //javascript error: {"status":32,"value":"An invalid or illegal selector was specified"}
        //3.when element is not visible
        //driver.findElement(By.xpath("//input[@id='input-email1']")).sendKeys("Selenium");
        //NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@id='input-email1']"}
        //4.When expression is incorrect
        //driver.findElement(By.xpath("//input[@@@id='input-firstname']")).sendKeys("Selenium");
        //The string '//input[@@@id='input-firstname']' is not a valid XPath expression."}


    }
}
