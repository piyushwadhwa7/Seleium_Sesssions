package ExceptionHandling;

import org.apache.commons.lang3.ObjectUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class customer {

    String name;

    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        customer obj=new customer();
        obj=null;


        /**
         * Try aned catch should be together
         */

        try {

            int i = 9 / 0;// uncheck exceptions / runtime exceptions
            obj.name="rahul";// NPE
            System.out.println("hello");// this will not get printed
        }
        catch (ArithmeticException e){
            System.out.println(" AE is coming");
            e.printStackTrace();
        }
        catch (NullPointerException e){
            System.out.println(" NPE is coming");
            e.printStackTrace();
        }
        catch (Throwable e){// it can handle exception and error as well
            e.printStackTrace();
        }
//        catch (Exception e){
//            System.out.println(" some exception  is coming");
//            e.printStackTrace();
//        }

        System.out.println("bye ");

        /**
         * checked / Complie time exception
         */

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream ip =new FileInputStream("c:..test/pdf");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
