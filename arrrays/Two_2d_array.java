package dsa.arrrays;
import java.util.*;

public class Two_2d_array {
    
    public static boolean Search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at index ("+ i + "," + j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        // Input the matrix
        System.out.println("Enter 9 elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        // Ask for the key to search
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        Search(matrix, key);
    }
}
