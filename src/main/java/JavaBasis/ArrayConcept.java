package JavaBasis;

import java.util.Arrays;
import java.util.Objects;

public class ArrayConcept {
    public static void main(String[] args) {
        /**
         * What is array: Set/ collection of same data type
         * what is i need to store mutiple elemets in an variable then we can use array
         *
         * Limitations of the array:
         * 1-Size is fixed= Static array
         * To overcome this issue we have to use Dynamic array/ Arraylist
         * 2-It can store only similar type of data
         * To overcome this we can use Object array but this is still static array, then we can use ArrayList
         */

        int i=10;
        i=20;
        i=30;
        System.out.println(i);// this will print 30 and 10 and 20 are gone so if we need to store all values in same variable
        // we can use array

        //int array

        int p[]=new int[4];
        p[0]=10;
        p[1]=20;
        p[2]=30;
        p[3]=40;
        //p[4]=50;out of bound exception
        System.out.println(p[3]);
        System.out.println(p[1]);
        //System.out.println(p[4]);// out of bound exceptiom


        /**
         * use cases for array:
         * Month array :12--- 0 to 1
         * movie tickets seats : 120 seats
         *
         */

        System.out.println(p.length);

        // to print the values of an array: For loop

        for (int k=0; k<=p.length-1;k++){
            System.out.println(p[k]);//10 , 20 30 , 40
        }

        System.out.println("-------------");


        //for each loop ( Advance for loop )

        for (int h:p){
            System.out.println(h);
        }
        System.out.println("-----------");

        /**
         * Double array
         */
        double d[]= new double[3];//0-2
        d[0]=12.99;
        d[1]=23.23;
        d[2]=10.11;
        for (double f:d){
            System.out.println(f);
        }

        System.out.println("--------");


        /**
         * Charc array
         */


        char ch[]=new char[4];
        ch[0]='a';
        ch[1]='1';
        ch[2]='%';
        ch[3]='j';
        for (char e:ch){
            System.out.println(e);
        }


        System.out.println("-------------");


        /**
         * when no array varaibles are not created
         */

        int num[]= new int[4];
        num[0]=100;
        num[1]=500;
        num[2]=10250;
        num[3]=1050;

        System.out.println(Arrays.toString(num));// then why are we using the for loop


        String names[]=new String[5];
        names[0]="naveen";
        names[1]="rohit";
        names[2]="arun";
        names[3]="piyush";
        names[4]="riti";
        for (String e: names){
            System.out.println(e);
            if (e.equals("piyush")){
                System.out.println("Piyush is in operatioms");
                break;
            }
        }

        /**
         * Employee data
         * Name(String)
         * Age(Int)
         * Salary(Double)
         * Gender(char)
         * IsPerman(Boolean)
         */

        Object ob[]= new Object[5];// Object is supercalss of all the classes
        ob[0]="Madhu";
        ob[1]=25;
        ob[2]=23.4;
        ob[3]='f';
        ob[04]=true;

        System.out.println(Arrays.toString(ob));

        for (Object e:ob){
            System.out.println(e);
        }

        /**
         *  Limitations of the array:
         *          * 1-Size is fixed= Static array
         *          * To overcome this issue we have to use Dynamic array/ Arraylist
         *          * 2-It can store only similar type of data
         *          * To overcome this we can use Object array but this is still static array, then we can use ArrayList
         * Good examples :
         * Uber cab
         * 5PM
         * Booking [100]
         * Movie hall tickets:120 seats
         * Footers of the page
         * Number of employee in the company
         */



    }
}
