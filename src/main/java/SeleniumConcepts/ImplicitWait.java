package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    static WebDriver driver;

    /**
     * Here we will see how to use wait
     * sync concept
     * selen script<---> app
     * dynamic waits= 10 sec and ele is visible in 2 sec then 8 sec will gety cancelled
     * two types : Implicit and Explicit
     * Implicit wait: global wait ( Not recommended)
     * implicit wait cannot be used for non web elements example : url, title, alerts
     * Explicit wait: Webdriver wait and fluent wait
     *  Thread.sleep(2000);// this is static wait / hard wait( Not recommended)
     *  donot mix implicit and explicit wait together
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// selenium 4.x
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("piyushwadhwa123@gmail.com");//10sec
        driver.findElement(By.id("input-password")).sendKeys("password123");//10sec
        driver.findElement(By.xpath("//input[@value='Login']")).click();//10sec

        //homepage: 15 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));// overrrid@8
        //e 12 , e13 and e 14
        // registration page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));// overrrid@12
        //e 15 and e 16
        // for different pages we have to again and again define waits
        driver.quit();



    }

}
