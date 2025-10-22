package JAVA_Collections_Map;

import java.sql.Array;
import java.util.*;

public class P7_Longest_Consecutive_Sequence {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2,2,3,5,101,102,103,104,105,106};
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<Integer>();
        for(int num: arr){
            set.add(num);
        }
        System.out.println(set);
        ArrayList<Integer> set1 = new ArrayList<Integer>(set);
        System.out.println("Set1: "+set1);
        ArrayList<Integer> set3 = new ArrayList<>();
        Collections.sort(set1);
        int firstnumber = set1.get(0);
        int currentpos =  1;
        set3.add(firstnumber);
        while(set3.contains(set1.get(currentpos)-1)){
            set3.add(set1.get(currentpos));
            currentpos++;
        }
        System.out.println("Longest consecutive sequence: "+set3);
        System.out.println("Size of Longest consecutive sequence: "+set3.size());
    }
}
