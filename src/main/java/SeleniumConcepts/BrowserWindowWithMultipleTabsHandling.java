package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowWithMultipleTabsHandling {
    static WebDriver driver;
    /**
     * This method is to launch the browser and navigate to Amazon web page,
     * get the parent window handle and print it.
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://webdriver.io/docs/selectors/");//parent window
        String parentWindowId=driver.getWindowHandle();//parent window handle
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@class,'navbar__item navbar__link header-github-link')]")).click();//child window
        driver.findElement(By.xpath("//a[contains(@class,'navbar__item navbar__link header-twitter-link')]")).click();//child window
        driver.findElement(By.xpath("//a[contains(@class,'navbar__item navbar__link header-youtube-link')]")).click();//child window
        driver.findElement(By.xpath("//a[contains(@class,'navbar__item navbar__link header-discord-link')]")).click();//child window
        //Window handler API's
        //1.Any browser can be handled by this API
        //2.Advertisments can also be handle
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();// Iterator is above the parent window
        while(it.hasNext()){
            String WindowId=it.next();
            driver.switchTo().window(WindowId);
            System.out.println(driver.getCurrentUrl());
            Thread.sleep(2000);
            if (!parentWindowId.equals(WindowId)){
                driver.close();//close the window and after this driver will be lost so we have to come back to parent window
            }
        }
        driver.switchTo().window(parentWindowId);// come back to parent window
        System.out.println(driver.getTitle());
        driver.quit();

}}
