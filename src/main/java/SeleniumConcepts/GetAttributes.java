package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import WebDriverBasics.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.sampled.FloatControl;
import java.util.List;

public class GetAttributes {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        ElementUtil eleutil = new ElementUtil(driver);
        driver.get("https://www.flipkart.com/");
        By images = By.tagName("img");
        //List<WebElement> imagesList = eleutil.getElements(images);
        eleutil.getElementAttributeList(images,"src");
        System.out.println("==================");
        eleutil.getElementAttributeList(images,"alt");


    }
}
