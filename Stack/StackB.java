package dsa.Stack;

import java.util.ArrayList;

public class StackB {
    
    static class Stack
    {
        static ArrayList<Integer> list =new ArrayList<>();
        // rerturn true if the list is empty 
        public static boolean isEmpty()
        {
            return list.size()==0;
        }

        // push fxn

        public static void push(int data ) 
        {
            // we have passed the parameter that we want to push inside the stack  so we have written the data         {
            list.add(data);  // this fxn automatically add the data to the last index of the list 
        }
         
        // pop fxn
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top =list.get(list.size()-1);      // Stores the last element (top of stack) in variable top. 
            list.remove(list.size()-1);
            return top;                            // Returns the element that was removed.
        }

        // peeek
        public static int peek()
        {
              if(isEmpty())
            {
                return -1;
            }
           return  list.get(list.size()-1);  //   returns the top element of the stack without removing it.
        }

    }
    public static void main (String []args)
    {
        Stack s =new Stack();
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
