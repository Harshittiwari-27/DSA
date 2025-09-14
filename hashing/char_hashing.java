package dsa.hashing;

import java.util.Scanner;

public class char_hashing {
    public static void main(String[] args) {
        System.out.println("ENter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        char arr[]=new char[n];
        for(int i =0;i<n;i++)  //   Reading input: O(n)
        {
            arr[i]=sc.next().charAt(0);  // sc.next().charAt(0) to read a single character.
        }
    // precalculation            pre computation: O(n)
    int hash[]=new int[26];
    for(int i=0;i<n;i++)
    {
        hash[arr[i]-'a']++;
    }

     System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while(q>0)  // Answering queries: O(q)
        {

        //   while (q-- > 0) {  way to write  while(q>0)  q--; in a single line

            char ch = sc.next().charAt(0);   // .charAt(0) always picks the first character of whatever string the user entered.
            System.out.println("Count of '" + ch + "': " + hash[ch - 'a']);
            q--;
        }


    }
}

    

/// OUTPUT LIKE THIS:
//      Count of 'a': 2

//                         Overall = O(n + q)