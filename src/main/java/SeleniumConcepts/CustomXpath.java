package SeleniumConcepts;

import org.openqa.selenium.WebDriver;

public class CustomXpath {

    static WebDriver driver;

    /**
     * Xpath: Address of the elememt on the dom
     * 1.absolute xpath
     * /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
     * 2.relative xpath
     * //Formulas
     * //xpath axes: relationships= parent and childs , siblings
     * //function
     */
    //input[@id='email']
    //input --Find Elements
    //input[@placeholder]
    //input[@]
    //htmltag[@attr1='value' and @attr2='value']
    ////input[@id='input-email' and @placeholder='E-Mail Address'] -- for email field


    /**
     *How to write xpath for a lable which having some text with space
     * = we have to use a function called - //label[normalize-space='text value']
     */


    }

