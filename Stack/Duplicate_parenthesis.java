package dsa.Stack;

import java.util.Stack;

public class Duplicate_parenthesis {
    
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
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length();i++)
        {
            char ch =str.charAt(i);

            // closing
            if(ch== ')'){
                int count=0;
                while (!s.isEmpty() && s.peek() !='(') {
                    s.pop();
                    count++;
                    
                }
                if(count<1)
                {
                    return true;  // duplicate
                }
                else{
                    s.pop();  // opening pair
                }
            }
          
            else{
                s.push(ch);   // opening , opernad,    

            }


        }

        return false;
    }
    public static void main(String[] args) {
        String str ="((a+b))";                  // true
        String str2="(a-b)";                   // false
        System.out.println(isDuplicate(str2));
    
}
}