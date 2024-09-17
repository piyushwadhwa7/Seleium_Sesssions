package TestNGSessions;

import org.testng.annotations.*;

public class TestNGAnnotations {
    // global pre conditions
    // pre conditions
    // test steps + exp vs act result
    // after steps
    // global after steps


//	BS -- connect with DB
//	BT -- create user
//	BC -- launch Browser
//
    //	BM -- loginToApp
    //	add to cart test
    //	AM -- logout
    //
    //	BM -- loginToApp
    //	checkout test
    //	AM -- logout
    //
    //	BM -- loginToApp
    //	search test
    //	AM -- logout
//
//	AC -- close browser
//	AT -- delete user
//	AS -- disconnect With DB

    //1
    @BeforeSuite
    public void connectWithDB() {
        System.out.println("BS -- connect with DB");
    }


    //2
    @BeforeTest
    public void createUser() {
        System.out.println("BT -- create user");
    }

    //3
    @BeforeClass
    public void launchBrowser() {
        System.out.println("BC -- launch Browser");
    }

    //4 //7 //10
    // This method will run before and after each test method
    @BeforeMethod
    public void loginToApp() {
        System.out.println("BM -- loginToApp");
    }


    //11
    @Test
    public void searchTest1() {
        System.out.println("search test");
    }


    //5
    @Test
    public void addToCartTest() {
        System.out.println("add to cart test");
    }

    //8
    @Test
    public void checkOutTest() {
        System.out.println("checkout test");
    }

    //6 //9 //12
    // This method will run after each and every test method
    @AfterMethod
    public void logout() {
        System.out.println("AM -- logout");
    }

    //13
    @AfterClass
    public void closeBrowser() {
        System.out.println("AC -- close browser");
    }

    //14
    @AfterTest
    public void deleteUser() {
        System.out.println("AT -- delete user");
    }

    //15

    @AfterSuite
    public void diconnectWithDB() {
        System.out.println("AS -- disconnect With DB");
    }
}
