package JavaBasis;

public class AndOROperators {
    public static void main(String[] args) {
        //And operator = & and &&

        boolean c1=true;
        boolean c2=false;
        boolean c3=true;
        boolean c4=true;

        if (c1 & c2 & c3 & c4){// true AND false And true And true
            System.out.println("hi");
        }
        else {
            System.out.println("bye");
        }

        /**
         * The moment we add && and the condition is false its comes out and run the esle part due to which in terms
         * of peformance its faster.
         * && operator is also called "short circuit operator"
         */

        if (c1&& c2&& c3&& c4){// true && false
            System.out.println("hello");
        }
        else {
            System.out.println("byellow ");
        }



        //OR operator = | ,|| 
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=true;

        if (b1 | b2 | b3 | b4){// true AND false And true And true
            System.out.println("hi");
        }
        else {
            System.out.println("bye");
        }

        /**
         * The moment we add && and the condition is false its comes out and run the esle part due to which in terms
         * of peformance its faster.
         * && operator is also called "short circuit operator"
         */

        if (b2 || b2|| b3 || b4){// true && false
            System.out.println("hello");
        }
        else {
            System.out.println("byellow ");
        }
        
        
        //WAP = Input three different numbers 
        /**
         * WAP to find the greatest of three numbers
         */
        
        int x=100;
        int y=400;
        int z=300;
        
        if (x>y && x>z){
            System.out.println("X is greatest " );
        } else if ( y>z ) {
            System.out.println("Y is greatest ");
        } else  {
            System.out.println("Z is greatest");
        }

    }
}
