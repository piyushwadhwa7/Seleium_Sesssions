package JavaBasis;

public class staticMethodOverloading {

    public static void sendMail(){
        System.out.println("Send mail");
    }
    public static void sendMail(int a){
        System.out.println("Send mail"+a);
    }
    public static void sendMail(int a ,int b,String c){
        System.out.println("Send mail"+(a+b));
    }

    public static void main(String[] args) {
        staticMethodOverloading.sendMail();
        staticMethodOverloading.sendMail(10);
        staticMethodOverloading.sendMail(20,80,"METHOD OVERLOADING");
    }

}
