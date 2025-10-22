package JAVA_Collections_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Demo1 {
    public static void main(String[] args){
        HashMap m = new HashMap();
        m.put(1,100);
        m.put(2, "Ifran");
        m.put(3, 'A');
        m.put(4, true);
        m.put("obj", 100);      //key can be any data type
        m.put(2, "Shariff");    //updates the values at key 2
        System.out.println("M  = "+m);

        //with data types defined
        HashMap<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(101, "Ifran");
        m1.put(102, "Shariff");
        m1.put(103, "JAVA");
        System.out.println("M1 = "+m1);
        //get method to extract value from specific key
        System.out.println("Value at key 103 = "+m1.get(103));

        //remains method
        m1.remove(101);
        System.out.println("After removing element from m1: " +m1);

        //contains method
        System.out.println("Contains value JAVA: "+m1.containsValue("JAVA"));
        System.out.println("Contains Key 102: "+m1.containsKey(102));

        //keyset - returns all the keys as a set
        System.out.println("All the keys available in HashMap: "+m1.keySet());

        //.values - returns all the values as collection
        System.out.println("All the values from m1: "+m1.values());

        //entrySet method - To get all the entries as a set
        System.out.println("All the entries as a set: "+m1.entrySet());

        //to reach an entry individually we need to use loop
        System.out.println("Entries iterating via loop");
        for(Object ob: m1.entrySet()){
            System.out.println(ob);

        }

        //iterating using entry type
        System.out.println("Iterating using entry type");
        for(Map.Entry entry: m1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Object i: m1.keySet()){
            System.out.println("Value at key i: "+m1.get(i));
        }

        for(Object j: m1.values()){
            System.out.println("Values through iteration: "+j);
        }

        //using iterator method
        System.out.println("Using iterator method");
        Iterator itr = m1.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry e1 = (Map.Entry) itr.next();
            System.out.println(e1.getKey()+"  "+e1.getValue());
           // System.out.println(itr.next());


        }


    }

}
