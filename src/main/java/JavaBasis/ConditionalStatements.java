package JavaBasis;

public class ConditionalStatements {
    public static void main(String[] args) {

        int a=600;
        int b=300;
        if (a>b){//only and only bollean is allowed
            System.out.println("a is greater than b");

        }
        else {
            System.out.println("b is greater than a");
        }
        if(true){
            System.out.println("PASS");

        }
        else {//dead code
            System.out.println("FAIL");
        }

        //Nested if else conditons
        int  marks=100;
        if (marks<=100) {
            System.out.println("calculating grades");
            if (marks >= 100) {
                System.out.println("grade A");
                if (marks==100){
                    System.out.println("Eligable for scholership");
                }
                else {
                    System.out.println("Not eligable for scholership");
                }
            }
            else {
                System.out.println("Grade B");
            }
            if (marks<=50){
                System.out.println("Grade C");
            }
        }
        else {
            System.out.println("marks not valid");
        }



        //if-if-if-if-else
//        String browser ="chrome";// Donot compare strings with == equals to
//        if (browser.equals("chrome")){
//            System.out.println("launch browser");
//        }
//        if (browser.equals("firefox")){
//            System.out.println("launch firefox");
//        }
//        if (browser.equals("Safari")){
//            System.out.println("launch Safari");
//        }
//        if (browser.equals("Edge")){
//            System.out.println("launch Edge");
//        }
//        else {
//            System.out.println("Please pass the right browser name: " +browser);
//        }
        /**
         * There are major problems with this code
         * 1-Performance issue
         * why?- Becz it will go to each if iteration and else will also execute because It's if condition is getting failed
         * Why we require to go to other if iteration when my first condition is getting passed
         */
        
        
        //if-else-if
        String browser="chrome";
        if (browser.equals("chrome")){
            System.out.println("launch chrome");
        } else if (browser.equals("firefox")) {
            System.out.println("launch firefox");
        } else if (browser.equals("safari")) {
            System.out.println("launch safari");
        } else if (browser.equals("edge")) {
            System.out.println("launch edge");
        }
        else {
            System.out.println("please pass the browser name "+ browser);
        }

    }
 
}
