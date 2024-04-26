package JavaBasis;

public class Rest {

    public void m1(){
        System.out.println("m1 method");
        m2();
    }
    public void m2(){
        System.out.println("m2 method");
        m3();
    }
    public void m3(){
        System.out.println("m3 method");
        m1();
    }
    public static void t1(){
        System.out.println("t1 method");
        t2();
    }
    public static void t2(){
        System.out.println("t2 method");
        t3();
    }
    public static void t3(){
        System.out.println("t3 method");// if i want to call a non static method variable into static ones
        Rest r1 = new Rest();
        r1.m1();
    }

    public static void main(String[] args) {
        Rest obj = new Rest();
        obj.m1();
        Rest.t2();
    }
}
