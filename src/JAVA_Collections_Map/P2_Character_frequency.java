package JAVA_Collections_Map;

import java.util.HashMap;

public class P2_Character_frequency {
    // Count Character Frequency in a String
    public static void main(String[] args){
        String S = "IfranaA";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = S.toLowerCase().toCharArray();
        for(Character c: ch){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
    }
}
