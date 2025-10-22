package JAVA_Collections_Map;
import java.util.*;
public class P5_Isomorphic_Strings {
    //Question: Check if two strings are isomorphic (characters map one-to-one).
    //Input: s = "egg", t = "add"
    //Output: true

    public static void main(String[] args){
    String s1 = "egg";
    String s2 = "add";

    //char[] ch = s1.toCharArray();
    if(s1.length()!=s2.length()){
        System.out.println("Strings are not Isomorphic");
        return;
    }

    HashMap<Character, Character> map = new HashMap<Character, Character>();
    Set unused = new HashSet<>();

    for(int i=0;i<s1.length();i++){
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);
        if(map.containsKey(c1)){
            if(!map.get(c1).equals(c2)){
                System.out.println("Strings are not Isomorphic");
                return;
            }
        }
        else {
            if (unused.contains(c2)) {
                System.out.println("Strings are not Isomorphic");
                return;
            }
            map.put(c1, c2);
            unused.add(c2);
        }
    }
        System.out.println("Strings are Isomorphic");
    }
}
