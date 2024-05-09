package ExceptionHandling;

public class ThrowKeyword {

    public static void main(String[] args) {
        // throw

        String data = "test";

        if (data == null){
            // want to throw my own exception

            throw new RuntimeException(" data not found");

        }
        System.out.println(" print the form");


        System.out.println(" N ");
        try {
            int i = 9 / 0;//AE
        }
        catch(ArithmeticException e){
            e.printStackTrace();

        }
        finally {
            System.out.println(" finally block ");
        }
        System.out.println(" bye");

    }

    /**
     * TRY /CATCH is onky used or exception
     * throw- used for creating our own exception
     * throws - used to pass the exception form one class to another
     * finally block - its always used with the try catch block
     * purpose : whatever is written in finally block it will always getting excuted
     *
     * so what kind of code we will be writing inside the finally block
     * 1- close the browser
     * 2- disconnect with data base
     */


}
