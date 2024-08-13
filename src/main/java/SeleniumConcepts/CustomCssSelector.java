package SeleniumConcepts;

import WebDriverBasics.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

    static WebDriver driver;

    public static void main(String[] args) {

        driver= new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        /**
         *         css: its a locator with a special syntax
         *          css : [attribute='value'] its how its used
         *          for ID : #id
         *          for class: .className
         *          htmltag.className
         *          .form-control
         *          input.form-control
         *          .c1.c2.c3....cn
         *          input.form-control.private-form__control.login-email
         *          input.login-email#username ( htmltag#className#id or vise versa
         *          formla for other elemets
         *          htmltag[attribute='value']
         *
         *          input[placeholder*='Email address']--contains
         *          input[placeholder^='Email address']--starts with
         *          input[placeholder$='Email address']--ends with
         *
         *          text in css--not available
         *
         *          parent to child
         *          select#Form_getForm_country > option --direct
         *          select#Form_getForm_country option --indirect
         *
         *          child to parent? -- not available : backward traversing in dom is not allowed
         *          css is always forward traversing
         *
         *          siblign in css:
         *          precedding sibling in css -- NA
         *
         *          following sibling in css --label.control-label+input#input-email
         *
         *          indexing in css:
         *          select#Form_getForm_Country>option:last-child
         *          select#Form_getForm_Country>option:nth-child(3)
         *          select#Form_getForm_Country>option:first-child
         *
         *                             xpath              css
         *          1.syntax:          medium             easy
         *          2.performance      slow               faster
         *          3.backward         yes                no
         *          4.sibling          yes                yes-only following siblings
         *          5.text             yes                no
         *          6.ancestor         yes                no
         *          7.indexing         yes                yes--better
         *          8.startswith       yes                yes
         *          9.contains         yes                yes
         *          10.endswith        yes                yes
         *          11.comma/unoin     yes                yes
         *          12. And or        yes                yes
         *
         *
         *          comma in css:
         *          input#input-email,#input-password
         */

        By Loginfields= By.cssSelector("input#input-email,#input-password");
        int loginFiledsCount=driver.findElements(Loginfields).size();
        System.out.println(loginFiledsCount);
        if (loginFiledsCount==2){
            System.out.println("login fields are present");
        }

        /**
         * lets create a code in which we can capture both footers elemts and footer headers
         */

        //we can use union operater as follows : //footer//a |//footer//h5


        //12. Not in css
        /**
         * example we have to excluse an input field = search filed drom the search
         *
         * then custom css = input.form-control:not(input[name='search'])
         */

        //13. Famous interview question can we use only className in find elements
        driver.get("https://app.hubspot.com/login/?hubs_signup-url=knowledge.hubspot.com%2Faccount-management%2Fwhy-can-t-i-log-into-hubspot&hubs_signup-cta=cta_button");
        driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("abc");
        //InvalidSelectorException: Compound class names not permitted
        //which means we cannot use multple classnames at once




    }
}
