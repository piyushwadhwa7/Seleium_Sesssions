import PropertiesConcept.ReadProp;
import WebDriverBasics.BrowserUtil;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class UdemyTest {

    public static void main(String[] args) {
        //String browser ="chrome";
        ReadProp propReader= new ReadProp();
        Properties prop= propReader.initProp();
        BrowserUtil brutil = new BrowserUtil();
        WebDriver driver= brutil.launchBrowser(prop.getProperty("browser"));
        brutil.launchURL(prop.getProperty("url"));
        String actitile =brutil.getPageTitle();
        System.out.println(" page titile--"+ actitile);
        // validation / checkpoint
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
