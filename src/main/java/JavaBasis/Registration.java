package JavaBasis;

public class Registration {
    String name;
    String emailId;
    String phone;
    int age;
    String city;
    String dob;
    static String compName= "IBM";// const is only use for instance variable not for static


    // hidden- default const... will be added  by java when the object is created ( thats why we are able ot craete th eobject in main method

    public Registration(String name, String emailId){
        this.name=name;
        this.emailId=emailId;


    }
    public Registration(String name, String emailId,String phone){
        this.name=name;
        this.emailId=emailId;
        this.phone=phone;


    }
    public Registration(String name, String emailId,String phone, int age){
        this.name=name;
        this.emailId=emailId;
        this.phone=phone;
        this.age=age;


    }
    public Registration(String name, String emailId,String phone, int age, String city, String dob){
        this.name=name;
        this.emailId=emailId;
        this.phone=phone;
        this.age=age;
        this.city=city;
        this.dob=dob;



    }


    public static void main(String[] args) {
        Registration r1= new Registration("naveen","naveen123@gmail.,com");
        System.out.println(r1.name+ " " + r1.emailId+ "  "+ r1.dob+ "  "+ r1.city);

        Registration r2= new Registration("alkansha", "akansshu123@gmail.com", "9897451903",39,"delhi","02-02-2024");
        System.out.println(r2.name+" "+ r2.emailId+" "+ r2.phone+"  "+ r2.age+ " "+ r2.city+ "  "+ r2.dob);

    }


}
