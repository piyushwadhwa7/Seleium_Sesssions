package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    static WebDriver driver;


    public static void main(String[] args) {
        driver=new ChromeDriver();//browser
        driver.get("https://www.londonfreelance.org/courses/frames/index.html");//page
        driver.switchTo().frame(2);//frame 1
        driver.switchTo().frame("main");//frame2
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));//frame3
        String header=driver.findElement(By.tagName("h2")).getText();
        System.out.println(header);//NoSuchElementException: no such element: Unable to locate element: {"method":"tag name","selector":"h2"}

    }
}
