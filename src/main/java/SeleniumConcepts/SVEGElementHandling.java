package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SVEGElementHandling {
    static WebDriver driver;

    /**
     * SVG
     * Normal xpath will not work for this elements
     * svg[@fill='none']--not valid
     * (//*[local-name()='svg'])[1]--valid
     * @param args
     */


    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map/#/");
        Thread.sleep(6000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
        String xpathval="//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";
        List<WebElement> stateList= driver.findElements(By.xpath(xpathval));
        System.out.println(stateList.size());
        for (WebElement e:stateList) {
            String stateName=e.getAttribute("name");
            System.out.println(stateName);
        }
        driver.quit();
    }
}
