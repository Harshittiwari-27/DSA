package dsa.functions_methods;
import java.util.Scanner;

public class methodss1 {
    
     // Q: take input of the two no and print the sum
   
    //   Scanner sc=new Scanner(System.in);
    //  System.out.println("ENter the two nos");
    //  int a1=sc.nextInt();
    //  int b1=sc.nextInt();
    //  int sum1=a1+b1;
    //  System.out.println("sum is "+sum1);





 //  @@@@@@@@@@  MADE THE FXN   @@@@@@@@@@@@

static int sum(int a,int b)
{
    int c=a+b;
    return c;
          // System.out.println("this will never gonna be execute");     WE CANT WRITE ANYTHING AFTER RETURN ITS LIKE TATAT BYEEEE BYEE !!!!!!!!
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the two nos");
    int a=sc.nextInt();
    int b=sc.nextInt();
    // Call the sum function here
    int result=sum(a, b);
    System.out.println("sum is "+result);



}
}


                           
    

