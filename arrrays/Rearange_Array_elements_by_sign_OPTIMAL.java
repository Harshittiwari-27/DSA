package dsa.arrrays;


import java.util.*;                      // Import utilities: List, ArrayList, Arrays
public class Rearange_Array_elements_by_sign_OPTIMAL {
                        // Package name (optional, matches your project structure)


    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4, 7, 8};   // Input array (can be any mix)
        int n = arr.length;                         // Store length once

        List<Integer> pos = new ArrayList<>();      // Will hold all non-negative numbers (>= 0)
        List<Integer> neg = new ArrayList<>();      // Will hold all negative numbers (< 0)

        // --- Split the input into pos[] and neg[] while preserving order ---
        for (int i = 0; i < n; i++) {               // Visit each element
            if (arr[i] >= 0) {                      // If current element is non-negative
                pos.add(arr[i]);                    // push it into the 'pos' list
            } else {                                // otherwise it's negative
                neg.add(arr[i]);                    // push it into the 'neg' list
            }
        }

        int i = 0, index = 0;                       // i is a loop counter reused later; 'index' is a write pointer into arr

        // --- Case 1: More positives than negatives ---
        if (pos.size() > neg.size()) {
            // Alternate placement while both lists still have elements:
            for (i = 0; i < neg.size(); i++) {      // stop when negatives run out
                arr[2 * i]     = pos.get(i);        // even index gets a positive: 0, 2, 4, ...
                arr[2 * i + 1] = neg.get(i);        // next odd index gets a negative: 1, 3, 5, ...
            }
            // After using all negatives, the next free slot is:
            index = neg.size() * 2;                 // we filled 2 slots per used negative → next write index

            // Put the leftover positives at the end in original order:
            for (int j = i; j < pos.size(); j++) {  // start where we left off with i
                arr[index++] = pos.get(j);          // write and advance the index each time
            }
        }
        // --- Case 2: Negatives are more (or counts are equal) ---
        else {
            // Alternate placement while positives last:
            for (i = 0; i < pos.size(); i++) {      // stop when positives run out
                arr[2 * i]     = pos.get(i);        // even index gets a positive
                arr[2 * i + 1] = neg.get(i);        // odd index gets a negative
            }
            // Next free slot after using all positives:
            index = pos.size() * 2;                 // we filled 2 slots per used positive

            // Put the leftover negatives at the end in original order:
            for (int j = i; j < neg.size(); j++) {  // start where we left off
                arr[index++] = neg.get(j);          // write and advance
            }
        }

        System.out.println(Arrays.toString(arr));   // Print the final rearranged array
    }
}

    
}
