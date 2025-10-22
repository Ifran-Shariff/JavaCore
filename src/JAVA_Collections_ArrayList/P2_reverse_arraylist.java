package JAVA_Collections_ArrayList;
import java.util.*;
import java.util.ArrayList;
public class P2_reverse_arraylist {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,3,4,3,6));
        int left = 0;
        int right = arr.size()-1;
        while(left<right)
        {
           int temp = arr.get(right);
           arr.set(right, arr.get(left));
           arr.set(left, temp);
            left++;
            right--;
        }
        System.out.println("Reverse of arraylist: "+arr);
    }
}
