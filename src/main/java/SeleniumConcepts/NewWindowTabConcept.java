package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://webdriver.io/docs/selectors/");//parent window
        String parentWindowId=driver.getWindowHandle();//parent window handle

        //Semenium 4.x
        driver.switchTo().newWindow(WindowType.TAB);//Create new tab and switch to it
        driver.get("https://www.flipkart.com/");
        System.out.println("Child window title is: "+driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindowId);// come back to parent window
        System.out.println("Parent window title is: "+driver.getTitle());
        driver.quit();
    }
}
