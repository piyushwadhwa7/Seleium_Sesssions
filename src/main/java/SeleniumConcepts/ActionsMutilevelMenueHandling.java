package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMutilevelMenueHandling {

    static WebDriver driver;

    /**
     * This method is use when multilevel menue is present and we want to mouse hover and
     * go to other element as well
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        //These are only realted to Beverages
        By level1 = By.xpath("//button[contains(@id,'headlessui-menu-button-:R5bab6:')]//span[text()='Shop by']");
        By level2= By.linkText("Beverages");
        By level3=By.linkText("Tea");
        By level4 =By.linkText("Green Tea");
        //MultilevelMenue(level1, level2, level3, level4);
        MultilevelMenue(level1, "Baby Care", "Diapers & Wipes", "Diapers");


    }

    /**
     * This is also a good example of method overloading
     * This can be used in any type of multilevel menue
     * This is ,ore efficient and can be used for any type of multilevel menue
     * @param level1
     * @param level2
     * @param level3
     * @param level4
     * @throws InterruptedException
     */
    public static void MultilevelMenue(By level1, String level2, String level3, String level4) throws InterruptedException {
        driver.findElement(level1).click();
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(driver.findElement(By.linkText(level2))).perform();
        Thread.sleep(2000);
        act.moveToElement(driver.findElement(By.linkText(level3))).perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText(level4)).click();
        driver.quit();

    }

    public static void MultilevelMenue(By level1, By level2, By level3, By level4) throws InterruptedException {
        driver.findElement(level1).click();
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(driver.findElement(level2)).perform();
        Thread.sleep(2000);
        act.moveToElement(driver.findElement(level3)).perform();
        Thread.sleep(2000);
        driver.findElement(level4).click();
        driver.quit();
    }
}
