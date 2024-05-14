import WebDriverBasics.BrowserUtil;
import org.openqa.selenium.WebDriver;

public class UdemyTest {

    public static void main(String[] args) {
        String browser ="chrome";

        BrowserUtil brutil = new BrowserUtil();
        WebDriver driver= brutil.launchBrowser(browser);
        brutil.launchURL("https://www.udemy.com/");
        String actitile =brutil.getPageTitle();
        System.out.println(" page titile--"+ actitile);
        if (actitile.equals("Online Courses - Learn Anything, On Your Schedule | Udemy")){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is not correct");
        }

        String appurl=brutil.getPageCurrentUrl();
        System.out.println(appurl);
        if (appurl.contains("udemy.com")){
            System.out.println("url is correct");
        }
        else {
            System.out.println(" url is not correct ");
        }

        brutil.quitBrowser();



    }
}
