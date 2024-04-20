package JavaBasis;

public class Util {

    String name;
    int age;
    static String compName="google";

    public void getInfo(){
        System.out.println("get info");//method1
    }
    public static void sendMail(){//method 2
        System.out.println("send mail");
    }

    public static void main(String[] args) {
        Util u=new Util();
        // how to access non static var and method
        u.name="akta";
        u.age=23;
        u.getInfo();

        //how to access ststic variable and method
        // using class name
        Util.sendMail();
        System.out.println(Util.compName);

    }
}
