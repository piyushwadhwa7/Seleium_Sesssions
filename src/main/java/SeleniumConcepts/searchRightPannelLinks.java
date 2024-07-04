package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class searchRightPannelLinks {

    static WebDriver driver;

    public static void main(String[] args) {

        driver= new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        List<WebElement> rightLinkList=driver.findElements(By.xpath("//a[@class='list-group-item']"));
        System.out.println(rightLinkList.size());
        for (WebElement e : rightLinkList){
            String linksText=e.getText();
            System.out.println(linksText);
        }

        driver.quit();
    }
}
