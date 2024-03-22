package JavaBasis;

public class SwitchCase {
    public static void main(String[] args) {
        String browser="edge";

        /*
        *here when the browser is equal to launch edge it will directly go to edge and verifies whether edge is available
        * and comes out the switch as break is their
        *
        * */

        switch (browser) {
            case "chrome":// it will check any chrome case available
                System.out.println("launch chrome");
                break;//Come of the entire switch case
            case "firefox":
                System.out.println("launch firefox");
                break;
            case "safari":
                System.out.println("launch safari");
                break;
            case "edge":
                System.out.println("launch edge");
                break;
            default:
                System.out.println("please pass the correct browser"  + browser);
                break;
        }
    }
}
