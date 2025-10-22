package JAVA_Collections_Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTable_Demo1 {
    public static void main(String[] args){
        Hashtable t = new Hashtable();      //capacity 11,loadfactor - 0.75

        //defining hashtable with initial capacity(int) and load factor(float)
        Hashtable t1 = new Hashtable(100, 0.9f);

        //Hashtable with specific datatype
        Hashtable<Integer, String> t3 = new Hashtable<Integer, String>();
        t3.put(101, "Ifran");
        t3.put(101, "Shariff");  //updated value at 101
        t3.put(105, "Smith");
        //t3.put(null, "x");      //null not allowed for key - throws error
        //t3.put(102, null);  //null not allowed for value - throws error
        System.out.println(t3);


        //get method
        System.out.println(t3.get(105));

        //remove method
        t3.remove(103);
        System.out.println("After removing 103: "+t3);

        //contains
        System.out.println("Is key 105 present in Hasttable: "+t3.containsKey(105));
        System.out.println("Check if the Value Shariff is present or not: "+t3.containsValue("Shariff"));

        //isEmpty
        System.out.println("Check if hashtable is empty or not: "+t3.isEmpty());

        //get all the keys as set
        System.out.println("Keys: "+t3.keySet());

        //get all values as collections
        System.out.println("Values: "+t3.values());

        //printing values using loop
        System.out.println("printing values using loop");
        for(Object k: t3.keySet()){
            System.out.println(k+"  " +t3.get(k));
        }

        //handling entries
        for(Map.Entry ent: t3.entrySet()){
            System.out.println(ent.getKey()+"  "+ent.getKey());
        }

        //using iterator
        System.out.println("using iterator");
        Iterator itr = t3.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry e = (Map.Entry) itr.next();
            System.out.println(e.getKey()+ " "+e.getValue());

        }



    }

}
