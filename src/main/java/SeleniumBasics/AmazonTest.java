package SeleniumBasics;

public class AmazonTest {

    public static void main(String[] args) throws Exception {
        String browser = "firefox";
        BrowserUtil brutil = new BrowserUtil();
        brutil.lanchBrowser(browser);
        brutil.launchUrl("https://www.amazon.in/ref=nav_logo");
        String title=brutil.getPageTitle();
        if(title.contains("Amazon")){
            System.out.println("Correct Title ----PASS");
        }
        else {
            System.out.println("Incorrect Title---FAIL");
        }
        brutil.getPageURL();
        brutil.closeBrowser();


    }
}
