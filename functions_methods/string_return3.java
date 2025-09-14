package dsa.functions_methods;
import java.util.Scanner;

public class string_return3{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the persaon name u want to be greeted ");
     String name =sc.next();
     

    System.out.println(greet()+" "+name.toUpperCase());
        
}
    static String greet(){
        return "HELLO !!";                        
    }
}

    


