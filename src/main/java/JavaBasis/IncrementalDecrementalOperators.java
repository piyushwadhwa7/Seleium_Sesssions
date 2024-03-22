package JavaBasis;

public class IncrementalDecrementalOperators {
    public static void main(String[] args) {
        //++ and --

        //1.post increment: First assign then increase
        int a=1;
        int b=a++;
        System.out.println(a);//2
        System.out.println(b);//1


        int h =-99;
        int j=h++;
        System.out.println(h);//-98
        System.out.println(j);//-99

        int s=5;
        System.out.println(s++);//5

        int t=10;
        int f=t++;
        System.out.println(t);
        System.out.println(f);

        //2.Pre increment: First increase then assign

        int x=5;
        int y=++x;
        System.out.println(x);
        System.out.println(y);

        int l=10;
        System.out.println(++l);//11
        System.out.println(l);//11

        //3.Post decrement: First assign then decrease

        int n=9;
        int n1=n--;
        System.out.println(n);//8
        System.out.println(n1);//9

        //4.Pre decrement: First decrease then assign

        int k=2;
        int f2=--k;
        System.out.println(k);//1
        System.out.println(f2);//1

    }

}
