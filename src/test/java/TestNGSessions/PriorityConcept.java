package TestNGSessions;
import org.testng.annotations.Test;

import java.time.Duration;

public class PriorityConcept {
    /**
     * when same priopty is given then it will follwo alphabetically
     * when no priority is given then it will follow default 0 and for prioty ones the given priority
     * negative is also accepted
     * we can also add dexription asn well
     */
    @Test(priority = 1, description = "search test")
    public void searchTest1() {
        System.out.println("search test");
    }


    @Test(priority = 5)
    public void addToCartTest() {
        System.out.println("add to cart test");
    }

    @Test(priority = 2)
    public void checkOutTest() {
        System.out.println("checkout test");
    }
    @Test(priority = 4)
    public void paymentTest() {
        System.out.println("payment test");
    }
    @Test(priority = 3)
    public void orderTest() {
        System.out.println("order test");
    }
}
