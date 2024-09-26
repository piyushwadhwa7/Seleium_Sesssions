package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
    /**
     * Use case : if we want to run same test multiple times then we can use invocationCount
     * if we really want to generate some mutltiple user then we can use / dummy users or requsiitons or allcoations
     *
     */

    @Test(priority = 1,invocationCount = 5)
    public void addToCartTest() {
        System.out.println("add to cart test");
    }
}
