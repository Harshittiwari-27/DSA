package dsa.arrrays;

import java.util.*;

public class Majority_elements_grtr_thn_n_by_2_BETTER {
    public static int majorityElement(int[] arr) {
        // HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        int result = majorityElement(arr);
        System.out.println(result); // Output: 2
    }
}
