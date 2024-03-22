package JavaBasis;

public class IncrementDecrementTest {
    public static void main(String[] args) {
        int i =10 ;
        i=i++ + ++i;

        System.out.println(i);//22

        int a=11, b=22, c;
        c=a+b+a++ + b++ + ++a + ++b;
        System.out.println("a="+ a);
        System.out.println("b="+b);
        System.out.println("c=" +c);


        int f=1,g=2,h=3;
        int n=f-- - g-- - h--;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(n);





        
    }
}
