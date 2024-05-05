package WebDriver_Arch_Interface;

public class chromeDriver implements webDriver{


    public chromeDriver(){
        System.out.println("chrome is launched");
    }
    @Override
    public void findElement(String name) {
        System.out.println("finding element with name "+ name);

    }

    @Override
    public void findElements(String name) {
        System.out.println("finding elements with name "+ name);

    }

    @Override
    public void get(String url) {
        System.out.println("launching the url"+ url);

    }

    @Override
    public String gettitle() {
        return "amazon";
    }

    @Override
    public void click(String element) {
        System.out.println("clicking on the elements "+ element);

    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println(" enter the value "+ value + " in element "+ element);

    }

    @Override
    public void close() {
        System.out.println(" closing the browser");

    }
}
