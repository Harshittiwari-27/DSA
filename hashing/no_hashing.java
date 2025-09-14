package dsa.hashing;
import java .util.*;
public class no_hashing {
    public static void main(String[] args) {
        System.out.println("ENter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // precompute
        int hash[]=new int[13];
        for(int i=0;i<n;i++)   // it goes through each ellement in the array
        {
  /*        
for (int i = 0; i < n; i++) { hash[arr[i]]++; }
This loop goes through every element in the input array arr.
Suppose arr[i] = x. Then hash[x]++ means → increase the count at index x by 1.
Basically, it is counting frequency of each number.
 */
            hash[arr[i]]++;
        }

        // queries
        System.out.println("enter the no of quieries");
        int q = sc.nextInt();
        System.out.println("enter the queries");
        while (q-- > 0) {   // q-- > 0 means: check if q is greater than 0, then reduce it by 1 each time 
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();
    }
}


