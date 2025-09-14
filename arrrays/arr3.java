package dsa.arrrays;
import java.util.Arrays; 
import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String nanmes");
        // array of objects
        String [] str=new String[5];
         for(int i=0;i<str.length;i++)
         {
            str[i]=sc.next();
         }
         System.out.println(Arrays.toString(str));

        // modify the array                       
        str[1]="harsh";
        System.out.println(Arrays.toString(str));

    }
    
}
