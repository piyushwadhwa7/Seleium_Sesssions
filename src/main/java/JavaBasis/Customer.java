package JavaBasis;

public class Customer {
    /**
     * Here we will se what is method overloading
     * We cannot create two functions with same name but with this we can
     * Mehtod overlodaing-OOP(Object oriented programing= poly( many)+ morphisim(forms): Compile time static
     *  when in same class we have methods as :
     *  1-with same name
     *  2-with different number of params
     *  3-with different sequence of params
     *  4-return type doesnot matter
     */

    public void test(){// O params
        System.out.println("test method");

    }
    public void test(int a){// 1 params
        System.out.println("test method"+a);

    }
    public void test(int a,String b){//2 params usage
        System.out.println("test method "+a+b);
    }
    public void test(String a,String b){//2 params usage
        System.out.println("test method "+a+b);
    }
    public void test(String a,int b){//2 params usage
        System.out.println("test method "+a+b);
    }
    public void test(int a,String b,float f){//2 params usage
        System.out.println("test method "+a+b);
    }

    /**
     * what can be the use case of this method overloading
     * 1- search in amazon
     */

    //AMAZON
    public void search(){
        System.out.println("Default search");
    }
    public void search(String name){
        System.out.println("Default search");
    }
    public void search(int price){
        System.out.println("Default search");
    }
    public void search(String color,int price, String name){
        System.out.println("Default search");
    }

    //Payment method
    public void doPayment(String upi){

    }
    public void doPayment(String cc, int cvv){

    }
    public void doPayment(String cc, int cvv, int otp){

    }

    //LOGIN: Return type doesnot matter
    public void doLogin(){

    }
    public boolean doLogin(String username, String password){
        return true;

    }
    public int doLogin(String username, String password, String role){
        return 100;
    }


    public static void main(String[] args) {
        Customer cs= new Customer();
        cs.test();
        cs.test(10);
        cs.test(10,"testing");
        cs.test("new","world");
        cs.test(10,"testing",12.33f);

    }
}
