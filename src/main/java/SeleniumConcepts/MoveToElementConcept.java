package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
    static WebDriver driver;

    /**
     * Mouse hover concept
     * elements which are hidden and not visible until user do a mouse hover
     * @param args
     */

    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        By FashionMenu = By.xpath("//span[text()='Fashion']");
        By MenFootwear = By.xpath("//a[text()='Men Footwear']");
        handelParentSubMenu(FashionMenu, MenFootwear);


    }

    /**
     * Handles the parent-child menu interaction by hovering over the parent element and clicking on the child element.
     *
     * @param  parentLocator  the locator for the parent element
     * @param  childLocator   the locator for the child element
     * @throws InterruptedException  if the thread is interrupted while sleeping
     */
    public static void handelParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(parentLocator)).perform();
        Thread.sleep(2000);
        driver.findElement(childLocator).click();
        //driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
    }
}
