package JavaBasis;

public class User {


    //Class variables
    String name;
    int age;
    String city;

    public static void main(String[] args) {
        User u1= new User();
        u1.name="Arti";
        u1.age=23;
        u1.city="PUNE";

        User u2= new User();
        u2.name="Rohan";
        u2.age=22;
        u2.city="mumbai";

        User u3= new User();
        u3.name="MOHAN";
        u3.age=88;
        u3.city="LA";

        System.out.println(u1.name+" " + u1.age+" "+u1.city);
        System.out.println(u2.name+" " + u2.age+" "+u2.city);
        System.out.println(u3.name+" " + u3.age+" "+u3.city);


        System.out.println("--------------");
        u1=u2;
        System.out.println(u1.name+" " + u1.age+" "+u1.city);
        System.out.println(u2.name+" " + u2.age+" "+u2.city);
        System.out.println(u3.name+" " + u3.age+" "+u3.city);

        System.out.println("------------");

        u2=u3;
        System.out.println(u1.name+" " + u1.age+" "+u1.city);
        System.out.println(u2.name+" " + u2.age+" "+u2.city);
        System.out.println(u3.name+" " + u3.age+" "+u3.city);

        System.out.println("----------");

        u3=u1;
        System.out.println(u1.name+" " + u1.age+" "+u1.city);
        System.out.println(u2.name+" " + u2.age+" "+u2.city);
        System.out.println(u3.name+" " + u3.age+" "+u3.city);
    }
}
