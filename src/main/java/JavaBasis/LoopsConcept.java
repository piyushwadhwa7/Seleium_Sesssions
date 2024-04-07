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

            for (double d=1.0; d<=5.0; d++){
                System.out.println(d);
            }


        System.out.println("-------------");

            //charcters
        for (char ch='a'; ch<='z'; ch++){
            System.out.println(ch+"=" +(int)ch);// to print ascii table
        }
        /**
         * difference btw WHILE and FOR loop
         *
         * While loop use cases: when number of iterations are not fixed
         * 1. wait for element on the page : 10 , 5 , 20
         * 2.Wait for page loading: page loading senarios
         * 3.Webtable pagination : per page enteries
         * 4.Calendar handling
         * 5.page scrolling : Linkedin , swiggy or zomatoo
         *
         *
         * //For loop
         * 1-When number of iterations are fixed
         * Month dropdown: 1-12
         * Roles dropdown
         * Checkboxes
         */


    }
}
