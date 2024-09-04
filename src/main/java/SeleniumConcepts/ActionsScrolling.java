package SeleniumConcepts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/ref=nav_logo");
        Actions act = new Actions(driver);
        /**
         * Partial scrolling
         */
//        act.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(3000);
//        act.sendKeys(Keys.PAGE_UP).perform();
        //CMD/Control+arrow key up/down
        act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
        driver.quit();
    }
}
