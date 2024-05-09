package StringManupulation;

public class StringBuilderAndStringBuffer {

    public static void main(String[] args) {

        // mutable
        StringBuilder sb= new StringBuilder(" hello");
        sb.append("selenium");
        System.out.println(sb);


        StringBuffer sf= new StringBuffer(" testing");
        sf.append(" cypress");
        System.out.println(sf);
    }

}
