package JavaBasis;

public class Car {


    String name;
    String licenseNumber;
    String model;
    int price;
    static final int wheels =4;

    //instance variable : n number of copies will be created
    //Static variable: only one
    //Static varible can be created only at class level

    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="Honda accord";
        c1.licenseNumber="1221";
        c1.price=20;
        //c1.wheels=4;//comman value

        //Car.wheels=5;// now we haev manuplicated the wheels value so this can be a bug becz other cars can have wheels as 4
        //In this case we have to use final keyword

        Car c2=new Car();
        c2.name="BMW";
        c2.licenseNumber="2221";
        c2.price=60;
        //c2.wheels=4;//comman value

        Car c3=new Car();
        c3.name="Mercedes";
        c3.licenseNumber="2221";
        c3.price=60;
        //c3.wheels=4;//comman value

        /**
         * How to call static variable
         * upto jdk 7: Fixed sixe memory which can fill when more static varibles are created
         * so now Metaspace: Dynamic memory ( It will take spcae from RAM and allocated to CMA
         * 1-By using class name
         *NOTE : never use static variable with the object name
         */
        System.out.println(Car.wheels);// best way to use
        //2-Direct calling
        System.out.println(wheels);
        //garbage collector is only for heap memory

    }
}
