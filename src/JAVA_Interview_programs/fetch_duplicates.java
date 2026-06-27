package JAVA_Interview_programs;
import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class fetch_duplicates {
    public static void main(String[] args) {
        String str = "gsjeegi ifran";
        Set seen = new HashSet();
        Set duplicates = new HashSet();

        for (char c : str.toCharArray()) {
            if(!seen.add(c)){       //logic - seen is a set it only allows unique, here we are doing if seen does not add(!seen.add(c)) then store it in duplicates
                duplicates.add(c);
            }
        }
        System.out.println("Duplicate characters: "+duplicates);
        System.out.print("Count od duplicate characters: "+duplicates.size());
    }
}
