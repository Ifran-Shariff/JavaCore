package JAVA_Collections_ArrayList;

import javax.tools.StandardLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class P1_sum_of_pairs {
    //find the pairs whose sum is equal to given number
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,5,4,8,9));
        ArrayList pairs = new ArrayList<>();
        int number = 9;
        for(int i=0;i<arr.size();i++){
            int current= arr.get(i);
            for(int j=0;j<arr.size();j++) {
                if (i != j && arr.get(j) + current == number) {
                    System.out.println("Pairs that sum is equal to given number: " + arr.get(j) + " , " + current);
                }
            }
        }
    }
}
