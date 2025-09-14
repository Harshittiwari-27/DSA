package dsa.arrrays;

import java.util.*;
public class Leader_arr_sorted_OPTIMAL {

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n-1];   // rightmost element is always a leader
        leaders.add(maxRight);

        // Traverse from right to left
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }

        // Convert to array
        Integer[] leaderArr = leaders.toArray(new Integer[0]);

        // Sort leaders (O(k log k))
        Arrays.sort(leaderArr);

        // Print in array format
        System.out.println(Arrays.toString(leaderArr));
    }
}

    

