package JavaBasis;

public class Page {

    /**
     * psvm [String a[]]--JVM
     * caller method-- user methoid
     * not write buss logicn in main method
     *As main mehtod is comman method for callig all other mehtods variables
     * and if JVM has to call the page classs method then main have to be called again and again if main is not static
     * and main will create only one copy and JVM will not create any object it will directly called with the class name
     */

    public static void main(String a[]) {
        System.out.println("hello");
        Page.main(10);
        Page.main(20,30);

    }
    public static void main(int a ){
        System.out.println("hello"+a);

    }
    public static void main(int a ,int b){
        System.out.println("hello"+(a+b));

    }
    //practically we never use main method overloading
}
