package dsa.Stack;

import java.util.Stack;

public class Valid_Parenthesis {

    public static boolean isValid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            // opening
            if(ch== '(' || ch=='{' ||  ch== '[' )
            {
                s.push(ch);  // push the opening brackets
            }else{

                // closing

                if(s.isEmpty())   // kahi stack empty to mhi may be koi opening bracket aaye hi na to ? 
                {
                    return false;
                }


                if( (s.peek()=='(' && ch==')') 
                 || (s.peek()=='{' && ch=='}') 
                 || (s.peek()=='[' && ch==']') )
               {
                  s.pop(); // pair baan gaya to bahar kar do
               }
               else{
                return false;  // Invalid String
                
               }

            }
        }

        if(s.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="(({})[]";
        // calling the fxn
        System.out.println(isValid(str));
    }
    
}
