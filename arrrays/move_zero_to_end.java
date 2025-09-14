package dsa.arrrays;

import java.util.Arrays;
//import java.util.Scanner;

public class move_zero_to_end {
     public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        int arr[]={1,2,0,3,5,0,0,5,0,7,7,9};
        int j=-1;
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
          // If no zero found, array already fine
        if (j == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

         // Step 2: move non-zero elements ahead of zeros
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}