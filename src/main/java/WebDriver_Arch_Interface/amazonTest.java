package WebDriver_Arch_Interface;

public class amazonTest {

    public static void main(String[] args) {
        //String browserName = "chrome";
        chromeDriver driver= new chromeDriver();
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
