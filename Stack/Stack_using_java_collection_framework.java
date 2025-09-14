package dsa.Stack;
import java.util.*;
public class Stack_using_java_collection_framework {
      public static void main (String []args)
    {
       // Stack s =new Stack();
       Stack<Integer> s=new Stack<>();  // we have written the single line and made the whole stack
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())   // ye kaam tab tak karenge jab tak hamara stack khali nhi ho jata
        {
           System.out.println(s.peek()); // print the top element
            s.pop();
           // System.out.println(Stack.list);  // shows remaining elements
        }
    
}
}
