package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import java.time.Duration;

public class WaitForJsAlerts {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html"); // to accpet js alerts
        driver.findElement(By.id("alertexamples")).click();// accept alert example
        String text = getAlertText(10);
        System.out.println(text);
        driver.findElement(By.id("promptexample")).click();// alert prompt example
        sendKeysToAlert(10, "Piyush");



    }

    public static Alert JsAlerts( int timout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timout)); // 10 seconds
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static String getAlertText(int timeOut)
    {
        Alert alert =JsAlerts(timeOut);
        String text = alert.getText();
        alert.accept();
        return text;
    }
    public static void acceptAlert(int timeOut) {
        JsAlerts(timeOut).accept();
    }
    public static void dismissAlert(int timeOut) {
        JsAlerts(timeOut).dismiss();
    }
    public static void sendKeysToAlert(int timeOut, String text) {
        Alert alert =JsAlerts(timeOut);
        alert.sendKeys(text);
        alert.accept();

    }

}
