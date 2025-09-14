package dsa.arrrays;
import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
       // int b=sc.nextInt();
        int [] arr=new int[5];
// string of primitives

        // arr[0]=5;
        // arr[0]=1;
        //  arr[0]=15;
        //  arr[0]=17;
        //  arr[0]=169;
        //  // [5,1,15,17,169]
        //  System.out.println(arr[3]);


        // input using for loop 
        // for(int i=0;i<5;i++)

        // {
        //     arr[i]=sc.nextInt();    // input at each index
        // }
  
    //     for(int i=0;i<5;i++)

    //     {
    //         System.out.print(arr[i]+" ");
    // }



/*----------------------------------------- ENHANCED FOR LOOP  2nd method to print

For each element num in the array arr"   
        for(int num : arr)  // here num represents the elements of the array
    {
        System.out.print(num+" "); 
    }
/* 



/*  -------------------- 3rd way to print andmost nicesset one 

     for(int i=0;i<5;i++)

        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

 Arrays.toString(arr) is a built-in Java method that converts the entire array into a nicely formatted string, like this:
 
for eg :---------
If your array is:

int[] arr = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(arr));

outupt will be : [1, 2, 3, 4, 5]




*/

}
}
