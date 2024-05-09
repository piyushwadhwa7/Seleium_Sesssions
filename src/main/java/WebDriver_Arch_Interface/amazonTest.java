package WebDriver_Arch_Interface;

import ExceptionHandling.MyException;

public class amazonTest {

    public static void main(String[] args) {
        //String browserName = "chrome";
        //chromeDriver driver= new chromeDriver();
        //firefoxDriver driver = new firefoxDriver();
        /**
         * every time when we have to run the test in different browser we have to create a object of that browser so to overcome this we can u
         * use Topcasting
         */

        String browserName ="opera";
        webDriver driver= null;
        switch (browserName.toLowerCase().trim()){
            case"chrome":
                driver= new chromeDriver();
                break;
            case"firefox":
                driver= new firefoxDriver();
                break;
            case"safari":
                driver= new safariDriver();
                break;
            default:
                System.out.println("please pass the correct browser");
                throw new MyException( " Browser not found");
        }
        driver.get("https://www.netflix.com/in/");
        String title = driver.gettitle();
        System.out.println(" page title "+ title);

        if (title.equals("netflix")){
            System.out.println("title is correct ");
        }
        else{
            System.out.println(" title is not corretc ");
        }
        driver.findElements("netflix logo ");
        driver.sendKeys("email id ", " piyush.wadhwa@gmail.com");
        driver.sendKeys("password ", " piyushunique009");
        driver.click("login button ");
        driver.close();


    }
}
