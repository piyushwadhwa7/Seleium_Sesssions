package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TotalLinks {


    // total links
    // getch the text of each link ( if text is present)
    // check link is valid / not broken
    static WebDriver driver;

    public static void main(String[] args) {
        driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        //HTmlTag <a>
//        List<WebElement> LinkLis= driver.findElements(By.tagName("a"));
//        System.out.println("Total links "+ LinkLis.size());
//        for (int i=0; i<LinkLis.size(); i++) {
//            String text = LinkLis.get(i).getText();
//            if (text.length()!=0){
//                System.out.println(text);
//            }
//            //System.out.println(text);
//        }
//        System.out.println("____________");
//        for (WebElement e: LinkLis ){
//            String text = e.getText();
//            if (text.length()!=0){
//                System.out.println(text);
//            }
//        }

        By links = By.tagName("a");
        By images = By.tagName("img");
        System.out.println("total links"+ getElementsCount(links));
        System.out.println("total images"+ getElementsCount(images));
        List<String> listLinks = getElementsListText(links);
        System.out.println(listLinks);

          
    }
    public static List<WebElement> getElements( By locator ){
        return driver.findElements(locator);
    }
    public static int getElementsCount(By locator){
        return getElements(locator).size();
    }

    //WAF: To fetch the text oif each link and store it in some list and return
    //name: getElementsLists
    //param: By Locator
    // return: List<String>

    public static List<String> getElementsListText(By locator){
        List<WebElement> elelist = getElements(locator);// creating an empty list here
        List<String> eleTextList = new ArrayList<String>();
        for (WebElement e: elelist){
            String text = e.getText();
            if (text.length()!=0){
                eleTextList.add(text);// And when one by one we are fetching the text will add here in array list
            }
        }
        return eleTextList;
    }
}
