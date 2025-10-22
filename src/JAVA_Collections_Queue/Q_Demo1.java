package JAVA_Collections_Queue;
import java.util.*;
import java.util.PriorityQueue;
public class Q_Demo1 {
    public static void main(String[] args){

        PriorityQueue Q = new PriorityQueue();
        ArrayList arr  = new ArrayList();
        //adding elements
        Q.add("A");
        Q.add("B");
        Q.add("C");
        Q.add("C");
        //Q.add(100); // compilation error, classcastExecption, because hetrogeneous data not allowed
        //Q.offer(100);
        System.out.println(Q);      //insertion order preserved and duplicates preserved

        //to fetch head element
        System.out.println("Head Element using element(): "+Q.element());
        System.out.println("Head Element using peek(): "+Q.peek());

        PriorityQueue Q1 = new PriorityQueue();
       // System.out.println("Head Element of empty queue using element(): "+Q1.element());  //returns exception as Q1 has no elements
        System.out.println("Head Element of empty queue using peek(): "+Q1.peek());        //returns null as Q1 is empty

        //remove head element from the non-empty queue
        System.out.println("Removed head element of Q using remove(): "+Q.remove());
        System.out.println(Q);
        System.out.println("Removed head element of Q using poll(): "+Q.poll());
        System.out.println(Q);

        //remove head element from the non-empty queue
        //System.out.println("Removed head element of Q1 using remove(): "+Q1.remove());  //returns exception as the Q1 is empty
        System.out.println("Removed head element of Q1 using poll(): "+Q1.poll());      //returns null as the Q1 is empty


    }
}
