package ExceptionHandling;

public class Testing {
    public static void main(String[] args) {
        int a[]= new int[3]; //0-2
        try {

            a[3] = 19;// AIOB exception
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println(" bye ");

        // always write buisness logic after catch block
    }
}
