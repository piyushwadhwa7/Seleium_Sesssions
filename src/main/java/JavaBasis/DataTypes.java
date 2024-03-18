package JavaBasis;

import java.util.Collections;

public class DataTypes {
    public static void main(String[] args) {
        /*
        * Data types
        * Strict data type
        * 1- Primitive data type
        * No need to create the object , it will take some fixed space in the factory */

        /*1-Numeric type
        * a-Integral value
        * a:1- Integer type = byte , short , int , long
        * a:2- Floating - float , double
        * b: Character
        * 2-Boolean : True/False
        *
        * 2-Non primitive data type: need to create the object (oop) -- String , class , array , intrace */


        //1. byte: ( Always write the keywords with small letters )
        // Important to declare the size and range while declaring data tupe
        // 1 byte = 8 bits
        byte b =2;
        b =10; // here the value of b is updated
        System.out.println(b);
        byte h=30;

        //2.short :
        //size: 2 bytes= 16 bits
        //Range : -32768 to 32767
        short i = 1000;
        short I1= 1; // Here we can use bytes becz he will take less memory

        //3: int
        // size : 4 bytes = 32 bits
        int l= 50000;
        int l1 =10;

        //4. long :
        // size = 8 bytes = 64 bits

        long t = 100000000;
        long t1= 23232009888888L;
        System.out.println(t1);

        long tel = 9897451907L;// telephone ,SSH ,adhar card ,acc number cc

        //5. flot:
         //range: 4 bytes = 32 bites
        //range : upto 7 digits can be taken
         float r= 12.22f;
        System.out.println(r);
        float r1= (float) 34.33;
        System.out.println(r1);


        //6double:
        //size: 8bytes = 64 bits
        //range : upto 15 digits can be taken

        double d= 12.2222222d;
        System.out.println(d);
        double d1= 100;
        System.out.println(d);// here it will print 100.0

        //7. Character:
        //size: 2 bytes = 16 bits
        char c1='b'; //a to z
        char c2='B';//A to Z
        char c3='1'; // 0-9
        char c4='%';//special characters

        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c4);

        //8.boolean:
        //size: 1bit
        //range: true.false--boolean literals

        boolean b1=true;
        boolean fglat=false;
        System.out.println(b1);
        // we use this in to asserttons








    }
}
