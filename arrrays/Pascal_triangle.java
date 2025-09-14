package dsa.arrrays;

import java.util.*;
public class Pascal_triangle {


//public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> tempList = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                // First and last elements are always 1
                if (col == 0 || col == row) {
                    tempList.add(1);
                } else {
                    // Add sum of two numbers from previous row
                    tempList.add(ans.get(row - 1).get(col - 1) + ans.get(row - 1).get(col));
                }
            }

            ans.add(tempList);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5; // number of rows
        List<List<Integer>> triangle = generate(n);

        // Print the triangle
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

    

