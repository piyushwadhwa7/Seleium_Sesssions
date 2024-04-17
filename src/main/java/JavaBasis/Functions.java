package JavaBasis;

public class Functions {


    /**
     * Function: A piece of code which you give someting, and you get something
     * Data member of the class
     * cannot create function inside a function as main is also a function      *
     * function are always parallel to each other
     * but can call a function with another function
     */

    //1.With no input and no return
    //o input paramater
    //void->cannot return anything means we cannot add return keyword here
    public void test(){
        System.out.println("test meethod");
    }
    public void getInfo(){
        int a=23;
        int b=22;
        int c=a+b;
        System.out.println(c);
    }

    //2.With no input but some return
    //returntype:Int
    public int getBillAmount(){
        System.out.println("getBillAmount");
        int foodBill=100;
        int tax=20;
        int finalAmount=foodBill+tax;
        return finalAmount;//we can use manupulations in the main functions with return keyword


    }

    //3.Some input and some return
    //only write the logic once and use this again and again ( Re-usablity)
    public int add(int a, int b){
        System.out.println("Adding two numbers" );
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Functions obj=new Functions();
        obj.test();
        obj.getInfo();
        int m=obj.getBillAmount();//whenever we are calling a function which returns someting we have to store it in a
        //variable
        System.out.println(m);
        System.out.println(m-10);
        int n=obj.add(20,40);//here we have to provide some inputs
        System.out.println(n);

    }
}
