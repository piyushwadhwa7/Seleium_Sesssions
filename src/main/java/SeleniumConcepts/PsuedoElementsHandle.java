package SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsHandle {
    /**
     * Psudeo elemets
     * ::Before
     * ::after
     * ::first-line
     * ::first-letter
     * So where input fields there are mandatory field with astrics after it they use this :: before etc
     */
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        String jsScript = " return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String Email = js.executeScript(jsScript).toString();
        System.out.println(Email);
        if (Email.contains("*")) {
            System.out.println("This is a mandatory field");
        } else {
            System.out.println(" This is not a mandatory field");
        }
        driver.quit();

    }
}
