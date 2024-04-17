package JavaBasis;

public class ArrayLiterals{
    public static void main(String[] args) {
        //1-int array
        //using new
        int i[]=new int[4];//0-3 What kind of data we have to declare


        //2-Array literals
        int p[]={1,2,3,4,4,5,6};// We know how many data items we have


        System.out.println(p.length);
        System.out.println("li= "+ 0);
        System.out.println("hi "+ (p.length-1));
        for ( int e:p){
            System.out.println(e);
    }
    }
}
