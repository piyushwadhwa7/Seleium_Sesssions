package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WebTableHandling {
   static WebDriver driver;

    /**
     * Main function to perform a specific action using ChromeDriver.
     *
     * @param  args	Command-line arguments passed to the function
     * @return        No return value
     */

    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        //driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
        selectUserName("Joe.Root");
        selectUserName("Kevin.Mathews");
        System.out.println(getUserDataList("Joe.Root"));
        driver.quit();
    }


    /**
     * Selects a user by clicking on the checkbox associated with their username.
     *
     * @param  username  the username of the user to select
     */

    public static void selectUserName(String username){
        driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

    }

    /**
     * Retrieves a list of strings representing the data associated with a given username.
     *
     * @param  username  the username of the user whose data is to be retrieved
     * @return           a list of strings containing the data associated with the given username
     */

    public static List<String> getUserDataList(String username){
        List<WebElement> userDataList=driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
        List<String> DataList=new ArrayList<String>();
        for (WebElement e: userDataList ) {
           String text = e.getText();
            DataList.add(text);
        }
        return DataList;
    }
}
