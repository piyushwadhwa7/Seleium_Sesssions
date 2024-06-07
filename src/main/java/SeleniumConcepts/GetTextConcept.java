package SeleniumConcepts;

import WebDriverBasics.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By header = By.tagName("h2");
        By Forgotpswd = By.linkText("Forgotten Password");
        By para=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");

        ElementUtil util = new ElementUtil(driver);
        String h = util.doGetText(header);
        System.out.println(h);
        String pswd=util.doGetText(Forgotpswd);
        System.out.println(pswd);
        String p =util.doGetText(para);
        System.out.println(p);

    }
}
