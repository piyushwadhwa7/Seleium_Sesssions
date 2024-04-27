package OOPEncapsulation;

public class Employee {
    /**
     * two data pointes to remenber here
     * 1- Private
     * 2- Public
     * Encapsulation means i am hiding my data members of the class via public layer
     * we can use this on the methods as well
     */

    private String name;
    private int age;
    private double salary;
    private boolean isActive;

    // all these global variables are private in nature i.e this can be used only inside this class only

    //public getter/ setter

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return salary;
    }
    public void seyAge(double salary){
        this.salary=salary;
    }
    public boolean getisActive(){
        return isActive;
    }
    public void setisActive(boolean isActive){
        this.isActive=isActive;
    }
}
