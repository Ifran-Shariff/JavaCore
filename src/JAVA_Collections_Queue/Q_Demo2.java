package JAVA_Collections_Queue;
import java.util.*;
import java.util.PriorityQueue;

public class Q_Demo2 {
    public  static void main(String[] args){

        //Iterating through the Queue
        PriorityQueue<Character> Q = new PriorityQueue<>(List.of('A','B','C','C'));
        Iterator it = Q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
