package JavaBasis;

public class callByRef {

    String name;
    int age;

    public static void test(callByRef t1){
        System.out.println("test method");
    }

    public static void main(String[] args) {
        callByRef r1= new callByRef();
        r1.name="rahul";
        r1.age=22;
        System.out.println(r1.name);
        System.out.println(r1.age);

        callByRef.test(r1);// call by reference
        // main advacntage is we have created only one object
    }
}
