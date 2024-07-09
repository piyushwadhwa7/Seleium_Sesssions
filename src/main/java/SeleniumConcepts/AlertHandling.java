package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

    static WebDriver driver;

    /*
    Alert types:
    1.JS Alert, 2.JS Confirm , 3.Js prompt
     */

    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.switchTo().alert();// NoAlertException: no such alert

        /**J1.S Alert
         *
         */
        By jsAlert= By.xpath("//button[text()='Click for JS Alert']");
        driver.findElement(jsAlert).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        String text= alert.getText();
        System.out.println(text);

        alert.accept();//ok button
        alert.dismiss();

        //2. JS Confirm
        By jsConfirm= By.xpath("//button[text()='Click for JS Confirm']");
        driver.findElement(jsConfirm).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        //alert1.accept();//Ok
        alert1.dismiss();//cancel


        /**
         * 3.JS Prompt
         */
        By jsPrompt= By.xpath("//button[text()='Click for JS Prompt']");
        Thread.sleep(5000);
        driver.findElement(jsPrompt).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.sendKeys("Selenium automation");
        alert1.accept();//Ok
        //alert1.dismiss();//cancel
        driver.quit();

    }
}
