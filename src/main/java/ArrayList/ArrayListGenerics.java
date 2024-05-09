package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListGenerics {

    public static void main(String[] args) {
        ArrayList<Integer> markslist = new ArrayList<Integer>();
        markslist.add(500);
        markslist.add(100);
        markslist.add(200);
        markslist.add(600);
        markslist.add(400);

        System.out.println(markslist);
        for (Integer e: markslist ){
            System.out.println(e);
        }

        System.out.println("----------");

        Collections.sort(markslist);
        System.out.println(markslist);

        Collections.sort(markslist,Collections.reverseOrder());
        System.out.println(markslist);

        System.out.println("---------");

        markslist.remove(0);
        System.out.println(markslist);

    }
}
