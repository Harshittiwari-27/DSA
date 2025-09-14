package dsa.Stack;
import java.util.*;

public class Reverse_String_by_Stack {
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

   public static String reverseString(String str)
   {
    Stack<Character > s =new Stack<>();
    int idx =0;
    while(idx<str.length())
    {
        s.push(str.charAt(idx));
        idx++;
    }
    StringBuilder result =new StringBuilder("");
    while(!s.isEmpty())
    {
        char curr =s.pop();
        result.append(curr);

    }
     return result.toString();

   }
   public static void main(String[] args) {
  //  String str="abc";
  String str ="HelloWorld";
    String result =reverseString(str);
    System.out.println(result);
   }
    
}
