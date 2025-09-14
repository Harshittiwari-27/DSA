package dsa.Stack;
import java.util.*;

public class Push_element_at_bottom_of_Stack {
   public static void pushAtBottom(Stack<Integer> s,int data )  // recurrisve fxn 

   {

    if(s.isEmpty())    // // base case
    {
        s.push(data);    //  put data when stack is empty
        return;
    }
    int top =s.pop();           // remove top element
    pushAtBottom(s, data);       // recursive call until stack becomes empty
    s.push(top);            // push the saved element back
   }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
    
}
