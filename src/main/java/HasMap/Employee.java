package HasMap;

import java.util.HashMap;

public class Employee {

    public static void main(String[] args) {
        //key,value

        HashMap<String, String> studendMap = new HashMap<String ,String>();
        studendMap.put("tom","A");
        studendMap.put("ravi","B");
        studendMap.put("LISA","G");
        studendMap.put("MOHIT","N");
        System.out.println(studendMap);
        System.out.println(studendMap.size());
        System.out.println(studendMap.get("tom"));


        System.out.println("-----------");

        HashMap<String , Integer> empmap = new HashMap<String, Integer>();
        empmap.put("ROHAN", 2000);
        empmap.put("mahima", 4000);
        empmap.put(" piyush", 70000);
        System.out.println(empmap );
        System.out.println(empmap.get("mahima"));



    }
}
