package JavaBasis;

import org.openqa.selenium.devtools.v117.network.model.CrossOriginEmbedderPolicyStatus;

public class Employee {

    //Data members of the class
    //Class variables: Instance variables
    String name;
    int age;
    double salary;
    boolean isPerm;




    public static void main(String[] args) {
        // create the object of the class employee: Using keyword new
        Employee obj =new Employee();
        obj.name="Rohan";
        obj.age=20;
        obj.salary=15.22;
        obj.isPerm=true;

        System.out.println("Name is "+  obj.name);
        System.out.println("Age of "+ obj.name +" " + "is" + " " + obj.age);
        System.out.println("Salary is"  + " " + obj.salary );
        System.out.println("Is Permanent"+obj.isPerm);


        Employee e1= new Employee();
        e1.name="Peter";
        System.out.println(e1.name+""+e1.age+""+e1.salary);

        new Employee().name="eKTA";//No reference objects: No recomended
        new Employee().age=30;


        //
        Employee e2=new Employee();
        e2.name="Kavi";
        System.out.println(e2.name);
        e2= null;
        e2.age=30;//null.age=30: Null pointer exception
        System.out.println(e2.age );


    }
}
