package dsa.Linkedlist;

import java.util.LinkedList;



public class LL_java_collection_framework {
    public static void main(String[] args) {
        // create - obbject int, float,boolean  -> Integer ,Float,Character
        LinkedList<Integer> ll=new LinkedList<>();

        // add
        ll.addLast(1);
         ll.addLast(2);
         ll.addFirst(0);

         // print
         System.out.println(ll);
         // remove
         ll.removeLast();
         ll.removeFirst();
         System.out.println(ll);
    }
    
}
