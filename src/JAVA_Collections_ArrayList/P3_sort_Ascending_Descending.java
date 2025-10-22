package JAVA_Collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class P3_sort_Ascending_Descending {
    public static void main(String[] ags){
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,3,2,6,7,4,0,6));
        System.out.println("Before sorting: "+arr);
        ArrayList<Integer> asc = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++) {
            //int current = arr.get(i);
            for (int j = 0; j < arr.size()-i-1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }

            }
        }
        System.out.println("Ascending sorted: "+arr);

        ArrayList<Integer> des = new ArrayList<>(List.of(1,3,2,6,7,4,0,6));
        for(int k=0; k<des.size()-1;k++){
            for(int l=0;l<des.size()-k-1;l++){
                if(des.get(l)<des.get(l+1)){
                    int temp1 = des.get(l+1);
                    des.set(l+1, des.get(l));
                    des.set(l,temp1);
                }
            }
        }
        System.out.println("Descending order: "+des);
    }
}
