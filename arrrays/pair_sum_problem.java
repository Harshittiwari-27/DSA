package dsa.arrrays;

public class pair_sum_problem {

    public static boolean Pair(int arr[], int sum) {   //             BRUTE FORCE METHOD
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair exists: " + arr[i] + " + " + arr[j]);
                    found = true;
                }
            }
        }
        return found;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 5;

        if (!Pair(arr, sum)) {
            System.out.println("No such pair");
        }
      
    }
}


