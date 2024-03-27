package JavaBasis;

public class LoopsConcept {
    public static void main(String[] args) {
        //1.While loop
        //1to10

//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            if (i==5){
//                System.out.println("bye");
//            }
//            i++;
//        }

        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            if (k == 5) {
                System.out.println("bye");
                break;//Dead code statement
            }
            k++;
        }



            //For loop
            //1to 10

            for (int p=1; p<=10; p++){
                System.out.println(p);
            }


    }
}
