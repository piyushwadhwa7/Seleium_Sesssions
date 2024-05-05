package OOPInheritance;

import JavaBasis.Car;
import org.checkerframework.checker.units.qual.C;

public class CarTest {

    public static void main(String[] args) {
        BMW B= new BMW();
        B.start();// overridden method
        B.stop();// inherited method
        B.refuel();// inherited
        B.autoParking();// individual


        System.out.println("------");

        CAR c= new CAR();
        c.start();
        c.stop();
        c.refuel();
        //c.autoParking();// Parent cannot take anythin from the child

    }


}
