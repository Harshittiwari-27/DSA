package dsa.arrrays;

public class pair_sum_optimal
{

    // 2 POINTER APPROACH (array must be sorted)
    public static boolean PairSum(int arr[], int sum) {
        int i = 0;               // left pointer
        int j = arr.length - 1;  // right pointer

        while (i < j) {
            int currSum = arr[i] + arr[j];

            if (currSum == sum) {
                System.out.println("Pair exists: " + arr[i] + " + " + arr[j]);
                return true;
            }
             else if (currSum < sum) {

                i++;  // move left pointer right
            }
             else {
                j--;  // move right pointer left
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; // sorted array
        int sum = 5;

        if (!PairSum(arr, sum)) {
            System.out.println("No such pair");
        }
    }
}

    

