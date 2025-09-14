package dsa.functions_methods;
import java.util.Arrays;
import java.util.Scanner;
 
public class swap4 {


    static  void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    System.out.printf("Before swap: a = %d, b = %d  and After swap: a = %d, b = %d\n", b, a, a, b);


        
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no u wnat to swap ");
    System.out.println("Enter the first no");
    int a =sc.nextInt();
   
    System.out.println("enter the second no u wnat to print");
    int b =sc.nextInt();
    swap(a, b);
        // System.out.println(a +" "+b);
    }
    

    

    



    //----------------------  Q change array

    // static void change(int []nums){
    //     nums[0]=99;  // Inside change(), you modify the first element of the array:



    // }

    // public static void main(String[] args) {
    //     int arr[]={1,3,2,45,6};
    //     change(arr);   //  pass the array to the method:
    //     System.out.println(Arrays.toString(arr));
    // }


}



/*

Arrays.toString(array) is a method from the java.util.Arrays class that converts an array into a readable string format, so you can easily print or log its contents.

*/








