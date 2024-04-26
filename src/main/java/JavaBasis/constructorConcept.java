package JavaBasis;

public class constructorConcept {

    String name;// global variables
    int age;
    double salary;

    /**
     * constructor:
     * name will be same as the class
     * it looks like a function but its not a function
     * cont... can not return anything , no void , no return type
     * const...can be overloaded
     * const..will be called when you create the object
     */

    /**
     * Const vs Function
     * const.. name should be same as class name but function can have any name
     * const.. cannot retuen anything but function can or cannot return
     * const and method/ function can be overloaded
     * const will be called whe you craete the object of the class but method is called using obj.ref name
     * const should be created for restricting the objects creation
     * function should be created for functionality , buisness logic
     * const.. is used to initialise the instance variables using the keyword as this.g=l
     * static variables should not be created inside the const.. but in function it can be used
     * const will not be crated in heap and stack
     *
     */

//    public constructorConcept(){
//        System.out.println("defult const...");
//    }
//    public constructorConcept(int a){
//        System.out.println("parma"+a);
//    }
//    public constructorConcept(int a,int b ){
//        System.out.println("parma"+(a+b));
//    }

    public constructorConcept(String  name){
        //name =name;// local varible value name is given to local variable only, my target is local to global
        this.name=name;// purpose of this keyword is to initalise the global variable

    }
    public constructorConcept(String name , int age ){
        this.name=name;
        this.age=age;
    }
    public constructorConcept(String name, int age , double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public static void main(String[] args) {
        constructorConcept c1= new constructorConcept("tom");
        System.out.println(c1.name );

        constructorConcept c2=new constructorConcept("peter", 30);
        System.out.println(c2.name);
        System.out.println(c2.age);

        constructorConcept c3= new constructorConcept("john", 34 , 12.33);// upto here 3 objkects will be created
    }

}
 