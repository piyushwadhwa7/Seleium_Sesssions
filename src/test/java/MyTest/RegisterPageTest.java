package MyTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.System.currentTimeMillis;

public class RegisterPageTest extends BaseTest{
    /**
     * Always remember that we have to add return when we are usingDataProvider
     * Also the return type is a 2d array object ( Data can be anything : string , char, ect )
     * Bad practice to use data fro Excel file as data can be corrupted and not readable
     * Also if we want every time the data to be dynamic we have to change in the excel itself
     */

    public static String getRandomEmailId() {
        String emailID= "opencart"+currentTimeMillis()+"@gmail.com";
        return emailID;

    }
    @DataProvider
    public Object[][] getRegTestData() {
        return new Object[][] {
                {"Prince1", "rajput1", "1234567890", "password000", "password000"},
                {"nikhil1", "sharma1","1234567890", "password000", "password000"}

        };

    }

    @Test(dataProvider = "getRegTestData")
    public void registerTest(String firstName, String lastName, String telephone, String password, String confirmPassword) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("input-firstname")).sendKeys(firstName);
        driver.findElement(By.id("input-lastname")).sendKeys(lastName);
        driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
        driver.findElement(By.id("input-telephone")).sendKeys(telephone);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(3000);
        String text= driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Your Account Has Been Created!");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Register")).click();


    }
}