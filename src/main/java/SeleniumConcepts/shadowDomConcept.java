package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        Thread.sleep(5000);
        /**
         * Only where #shadow-root ( open )
         * there only this will work
         */
        String jsScript="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
        Thread.sleep(3000);
        JavascriptExecutor js=((JavascriptExecutor)driver);
        WebElement pizza= (WebElement)js.executeScript(jsScript);
        pizza.sendKeys("dominos");
        //driver.findElement(By.id("pizza")).sendKeys("Pizzaa");
        driver.quit();


    }
}
