package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

    static WebDriver driver;
    static String username="admin";
    static String password="admin";

    /**
     * Authenciation pop up is not javascript alert
     * Here send.keys and switch method will not work
     * @param args
     */

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
        driver.quit();

    }
}
