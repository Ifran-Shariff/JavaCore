package JAVA_Interview_programs;
import java.util.*;
public class arraysort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};

        System.out.println(Arrays.toString(arr));
        int[] sorted = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
           for(int j=0; j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1]= temp;
               }
           }}
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}