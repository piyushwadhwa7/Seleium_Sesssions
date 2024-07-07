package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdDisabled {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.dailyobjects.com/ap?s=referer~uap");

        By getOtp= By.xpath("//button[@class='mat-focus-indicator call-to-action-button send-otp mat-raised-button mat-button-base mat-primary mat-button-disabled']");

        boolean f1=driver.findElement(getOtp).isDisplayed();
        System.out.println(f1);//true
        boolean f2=driver.findElement(getOtp).isEnabled();
        System.out.println(f2);//false
        Thread.sleep(2000);
        boolean b1=driver.findElement(By.xpath("//input[@id='mat-input-1']")).isSelected();
        System.out.println(b1);
        driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("9897451904");
        boolean f3=driver.findElement(getOtp).isDisplayed();
        System.out.println(f1);//true
        boolean f4=driver.findElement(getOtp).isEnabled();
        System.out.println(f2);//false

        driver.quit();
    }
}
