package OOPEncapsulation;

public class Browser {

    public void launchBrowser(){
        System.out.println("Launchbrowser ");
        checkBrowserCompatablity();
        checkBrowserVersion();
        checkBrowserUpdates();
        checkRamSpace();
        System.out.println("Browser is lauched");
    }

    private void checkBrowserCompatablity(){
        System.out.println("checkBrowserCompatablity ");

    }
    private void checkBrowserVersion(){
        System.out.println("checkBrowserVersion ");

    }
    private void checkBrowserUpdates(){
        System.out.println("checkBrowserUpdates ");

    }
    private void checkRamSpace(){
        System.out.println("checkRamSpace ");

    }
}
