package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
    /**
     * whenever we are getting any exception in our test the test will get failed
     * so we can add multiple expected exception via classes array
     * usages : Negavtive test cases where we are expected exceptions
     */
    String name ;


    @Test(priority = 1,description = "search test",expectedExceptions = {ArithmeticException.class,NullPointerException.class})
    public void addToCartTest() {
        System.out.println("add to cart test");
        int i =9/0;//Arithmeatic exception
        System.out.println("hello");
        ExpectedExceptionConcept obj = null;
        System.out.println(obj.name);//NPE
    }
}
