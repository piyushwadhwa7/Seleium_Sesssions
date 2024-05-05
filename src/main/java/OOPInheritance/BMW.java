package OOPInheritance;


public class BMW extends CAR{

    /**
     * mEthod overridding: poly+morphism = Runtime ( Dynamic )
     * when we have a method in parent class and the same method in child class with :
     * 1-same name
     * 2-with same number of parameters
     * 3-With same return type
     */
    @Override
    public void start(){// this is method overridden
        System.out.println(" BMW ==START");
    }
    public void autoParking(){
        System.out.println("BMW==Autoparking");
    }
}
