package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowHandling {
    static WebDriver driver;
    /**
     * This method is to launch the browser and navigate to Amazon web page,
     * get the parent window handle and print it.
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");//parent window
        Thread.sleep(1000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@src,'youtube')]")).click();//child window
        //1.Fetch the window ids:
        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> it = windowIds.iterator();
        String parentWindowId=it.next();
        System.out.println("Parent window id is: "+parentWindowId);
        String childWindowId=it.next();
        System.out.println("Child window id is: "+childWindowId);

        //2.switch working:
        driver.switchTo().window(childWindowId);
        Thread.sleep(2000);
        System.out.println("Child window title is: "+driver.getTitle());
        driver.close();//close the child window
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window title is: "+driver.getTitle());
        driver.quit();

    }
}