package dsa.arrrays;

public class Majority_MOORE_VOTING_ALGO_grtr_thn_n_by_2_OPTIMAL{   //  👉 Time Complexity: O(n)
                                                                 //   👉 Space Complexity: O(1)

    public static int majorityElement(int[] arr) {
        int cnt = 0;
        int el = 0;

        // Step 1: Find candidate using Boyer-Moore
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Step 2: Verify if candidate is actually majority
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) cnt1++;
        }

        if (cnt1 > arr.length / 2) {
            return el;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        int result = majorityElement(arr);
        System.out.println(result); // Output: 2
    }
}
