package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopuP {
    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
        /**
         * By type=File
         */
        By chooseFileButton= By.name("upfile");
        By uploadBtn= By.xpath("//input[@type='submit']");

        driver.findElement(chooseFileButton).sendKeys("C:\\Users\\piyus\\Documents\\Ubisofty codes.txt");
        driver.findElement(uploadBtn).click();

        /**
         * 1.AutoIT -tool: windows
         * Not at all recomened as: only works for windows machine ( its windows bash tool)
         * It will not work in headless mode
         * Not work in docker, jenkins
         * Only wokrs in local
         */
        /**
         * 2.Sikuli: It will work on images
         * always have to take screenshot
         * not recomended
         */

        /**
         * Robot class: its part of java
         * Only works in windows machine
         * not work in headless mode , jenkins , dockler etc
         */

        /**
         * Today every time we have to store in cloud and for that we only have to use SendKeys method
         */

        driver.quit();
    }
}
