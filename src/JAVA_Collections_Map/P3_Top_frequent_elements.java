package JAVA_Collections_Map;

import java.util.*;

public class P3_Top_frequent_elements {
    //Top K Frequent Elements Question: Return the k most frequent elements in an array.
    // Input: nums = [1,1,1,2,2,3], k = 2 Output: [1, 2]
    //pick the top k = 2 elements with the highest frequency:
    //- The most frequent is 1 (3 times)
    //- The next is 2 (2 times)
    
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int K = 2;
        //Find frequency of elements
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        System.out.println("Frequency of each: "+freq);

        //Use maxheap to get all the top frequency elements in highest to lowest order
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(freq.entrySet());        //this will add all the freqnencies in highest to lowest order

        //Fetch the elements of top K frequency
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<K;i++){
            list.add(maxheap.poll().getKey());
        }

        System.out.println("Top frequency keys: "+list);
        
    }
}
