package OOPEncapsulation;

public class EmpTest {

    public static void main(String[] args) {
        Employee e1= new Employee();

        e1.setName("Arti");
        System.out.println(e1.getName());

        e1.setAge(30);
        System.out.println(e1.getAge());
    }

    /**
     * Example in selenium:
     *public click()- --> private checking the element -->> visible
     * Amazon// --> public payment --> bacnk server-->> debit --> bacnk account
     */
}
