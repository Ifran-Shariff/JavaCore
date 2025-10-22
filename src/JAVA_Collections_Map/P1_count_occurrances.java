package JAVA_Collections_Map;

import java.util.HashMap;

public class P1_count_occurrances {
    //Input - {1, 2, 2, 3, 1, 4, 2}
    // Outout - {1=2, 2=3, 3=1, 4=1}
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }

}
