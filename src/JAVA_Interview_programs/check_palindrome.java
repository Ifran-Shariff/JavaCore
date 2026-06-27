package JAVA_Interview_programs;
import java.util.*;
public class check_palindrome {
    public static void main(String[] args){
        String str = "madam";
        char[] ch = str.toLowerCase().toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println(rev);
        System.out.println(str.toLowerCase());
        if(rev.equalsIgnoreCase(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}
