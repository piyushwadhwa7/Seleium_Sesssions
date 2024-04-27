package JavaBasis;

import java.util.Arrays;

public class Browser {

    //Acceptance critero
    /**
     * Launch a browser: Browser name(String)--Input data=Chrome/ edge
     * Return:Boolean:True/false
     */

    public boolean launchBrowser(String BrowserName){
        System.out.println("Launching browser-------"+ BrowserName);
        if (BrowserName.equals("chrome")){
            System.out.println("chrome is launched");
            return true;
        } else if (BrowserName.equals("firefox")) {
            System.out.println("Firefox is launched");
            return true;
        } else if (BrowserName.equals("Edge")) {
            System.out.println("Edge is launched");
            return true;
        } else if (BrowserName.equals("Safari")) {
            System.out.println("Safarti is launched");
            return true;
        }
        else{
            System.out.println("Please pass the right browser");
            return false;
        }
    }

    public boolean launchAppBrowser(String BrowserName) {
        System.out.println("Launching browser-------" + BrowserName);
        switch (BrowserName){
            case "chrome":
                System.out.println("Chrome is launched");
                return true;
            case "firefox":
                System.out.println("firefox is launched");
                return true;
            case "edge":
                System.out.println("edge is launched");
                return true;
            case "safari":
                System.out.println("safari is launched");
                return true;
            default:
                System.out.println("Please pass the right browser");
                return false;
        }
    }

    public int getStudentsMarks(String StudentName){
        System.out.println("Getting student marks------"+ StudentName);

        int marks=-1;
        switch (StudentName.trim().toLowerCase()){
            case "arti":
                marks=90;
                break;
            case "tom":
                marks=10;
                break;
            case "rahul":
                marks=50;
                break;
            case "piyush":
                marks=45;
                break;
            default:
                System.out.println("Please pass the right marks-----"+StudentName);
                break;
        }
        return marks;

    }


    /**
     * How to return mutiple values from a function
     */


    public int[] getData(){
        int num[]={10,20,30};
        return num;

    }
    //Caller method
    public static void main(String[] args) {
        Browser br= new Browser();

        int n[]=br.getData();
        System.out.println(Arrays.toString(n));
        int m1=br.getStudentsMarks("Arti  ");
        System.out.println(m1);
        if (m1>=0 && m1<=100){
            System.out.println("print the sheet");
        }
        int m2=br.getStudentsMarks("tom");
        System.out.println(m2);
        int m3=br.getStudentsMarks("pooja");
        System.out.println(m3);
        if (m3>=0 && m3<=100){
            System.out.println("print the marksheet");
        }





//        if(br.launchBrowser("chrome")){
//            System.out.println("Enter th url: https://mdcomputers.in/nvidia-geforce-rtx-40-series?bfilter=a80:16501;");
//        }
//        else{
//            System.out.println("no need to enter the url");
//        }
//        boolean flag=br.launchBrowser("chrome");
//        System.out.println(flag);
//        if(flag){
//            System.out.println("Enter url: https://www.asus.com/motherboards-components/graphics-cards/proart/proart-rtx4080s-16g/");
//        }
//        else {
//            System.out.println("Need need to enter the url");
//        }
    }
}
