package WebDriver_Arch_Interface;

public interface webDriver extends searchContext{



    @Override
    public void findElement(String name );// I can override my parents methods also in child interface

    public void findElements(String name );

    public void get(String url);

    public String gettitle();

    public void click(String element);

    public void sendKeys(String element, String value);

    public void close();




}
