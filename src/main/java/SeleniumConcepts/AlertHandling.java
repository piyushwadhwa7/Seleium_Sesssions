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
        By jsAlert= By.xpath("//button[text()='Click for JS Alert']");
        driver.findElement(jsAlert).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        String text= alert.getText();
        System.out.println(text);

        alert.accept();
        //alert.dismiss();

        driver.quit();

    }
}
