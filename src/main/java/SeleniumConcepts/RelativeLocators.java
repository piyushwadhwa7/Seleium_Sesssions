package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
//                 above
//                  |
//    //left<---webElement--->right
//                  |
//                  below

    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://www.aqi.in/in/dashboard/india/uttar-pradesh/meerut");
        WebElement ele=driver.findElement(By.linkText("Kulti, India"));
        String leftRank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();//5
        System.out.println("Left side rank is "+leftRank);
        String aqiScore=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();//158
        System.out.println("Right side rank is "+aqiScore);
        String belowCity=driver.findElement(with(By.tagName("p")).below(ele)).getText();//Kulti, India
        System.out.println("Below city is "+ belowCity);
        String aboveCity=driver.findElement(with(By.tagName("p")).above(ele)).getText();//Kulti, India
        System.out.println("Above city is "+ aboveCity);

    }
}
