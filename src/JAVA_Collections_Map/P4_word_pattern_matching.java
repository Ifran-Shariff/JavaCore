package JAVA_Collections_Map;
import java.util.*;
public class P4_word_pattern_matching {
    public static void main(String[] args) {
        //Question: Given a pattern and a string, determine if the string follows the same pattern.
        //Input: pattern = "abba", str = "dog cat cat dog"
        //Output: true
        String pattern = "aba";
        String str = "dog cat rat";
        String[] words = str.split(" ");

        //initial check, if the size of characters is not qual to size of words, hard stop
        if(pattern.length()!= words.length){
            System.out.println("False");
            return;
        }

        HashMap map = new HashMap<>();
        Set usedwords = new HashSet<>();
        for(int i=0;i<pattern.length();i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            //checks if the key is already present in map, if yes,
            // enter another loop and check if the key is mapped to the same word
            if (map.containsKey(c)) {
                if(!map.get(c).equals(words[i])) ;
                System.out.println("False");
                return;
            }
            //if map does not have the key already stored, then check if the set userdword contains the word
            else{
                if(usedwords.contains(w)){
                    System.out.println("False");
                    return;
                }
                map.put(c, w);
                usedwords.add(w);
            }
        }
        System.out.println("True");
    }
}

