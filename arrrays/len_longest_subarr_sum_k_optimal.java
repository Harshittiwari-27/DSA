package dsa.arrrays;

//import java.util.*;
public class len_longest_subarr_sum_k_optimal {
  //                                                  SLIDING WINDOW TECHNIQUE ---- 2 POINTER TECHNIQUE 

    public static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0, right = 0;   // we have intialize the two pointers i.e. the left and the right  one 
        long sum = a[0];
        int maxLen = 0;        // count the max len of the sub aarray whose sum is equal to k
        int n = a.length;

        while (right < n) {           // keep incresing the right until it reaches the end
            while (left <= right && sum > k) {   // If the window’s sum is too big, shrink from the left until it’s not greater than k
                sum -= a[left];
                left++;
            }
            if (sum == k) {   //       If current window hits the target sum, update the best length.
                maxLen = Math.max(maxLen, right - left + 1);
            }

 //        Move the right boundary forward by one, and if it’s still within bounds, add the new element to the window sum. 
           
            right++;
            if (right < n) {
                sum += a[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        long k = 6;
        System.out.println("Longest subarray length with sum " + k + " is: " + longestSubarrayWithSumK(arr, k));
    }
}

    

