package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
    /**
     * DependsOn : TestNg will check whether any test method depends on this test method
     * we shoudl never use dependsOn in @Test as it will create probelm in parrrel execution
     * Also we shoudl also never used priroty as well
     * AAA pattern : AAA = Arrange - Act - Assert
     */
    @Test
    public void loginTest() {
        System.out.println("Login test");
        int i = 9 / 0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void addToCartTest() {
        System.out.println("add to cart test");
    }
}
