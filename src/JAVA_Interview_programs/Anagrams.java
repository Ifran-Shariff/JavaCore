package JAVA_Interview_programs;

import java.util.Arrays;

public class Anagrams {
    //check if two strings are anagrams or not using hashmap
    public static boolean CheckAnagrams(String str1, String str2){
            String s1 = str1.replaceAll("\\s","").toLowerCase();
            String s2 = str2.replaceAll("\\s","").toLowerCase();
            if(s1.length()!=s2.length()){
                return false;
            }
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
    public  static void main(String[] args){
        String str1 = "ant";
        String str2 = "tao ";
        if(CheckAnagrams(str1, str2)){
            System.out.println("Given strings are anagrams");
        }
        else{
            System.out.println("Given strings are not anagrams");
        }
    }
}