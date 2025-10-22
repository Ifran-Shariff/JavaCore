package JAVA_Collections_Map;
import java.util.HashMap;
import java.util.Map;
public class P6_SubArray_Sum_Equals_K {

      public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            int k = 3;

            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1); // Base case: prefix sum 0 occurs once

            int sum = 0;
            int count = 0;

            for (int num : nums) {
                sum += num;

                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            System.out.println("Subarrays that sum equal to k" +map);
            System.out.println("Number of subarrays that sum to " + k + ": " + count);
        }
}

