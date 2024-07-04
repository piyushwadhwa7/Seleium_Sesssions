package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        By searchField = By.name("q");
        By suggestions= By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
        doSearch(searchField,"cypress testing",suggestions,"jobs");

        driver.get("");
        driver.quit();
    }


    public static void doSearch( By locator , String searchKey , By Suggestions , String value) throws InterruptedException {
        driver.findElement(locator).sendKeys(searchKey);
        Thread.sleep(3000);
        List<WebElement> suggList=driver.findElements(Suggestions);

        System.out.println(suggList.size());

        for (WebElement e: suggList){
            String text=e.getText();
            System.out.println(text);
            if (text.contains(value));
            e.click();
            break;
        }
        

    }

}
