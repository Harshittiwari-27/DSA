package dsa.arrrays;

import java.util.Scanner;

public class rotate_by_optimal {
     public static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rotations:");
        int k = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Handle cases where k > n
        k = k % n;

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);

        // Print rotated array
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
