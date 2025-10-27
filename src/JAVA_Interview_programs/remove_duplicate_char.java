package JAVA_Interview_programs;

import java.util.Iterator;
import java.util.*;
public class remove_duplicate_char {
    public static void main(String[] args){
        String str = "Hello World";
        String result = "";
        char[] ch = str.trim().toLowerCase().toCharArray();

        for(char c: ch){
            if(result.indexOf(c)==-1){
                result+=c;

            }
        }
        System.out.println("after removing duplicates: "+result);
    }
}
