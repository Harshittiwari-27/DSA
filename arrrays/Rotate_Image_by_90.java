package dsa.arrrays;

public class Rotate_Image_by_90 {

    public static void main(String[] args) {
        int[][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
        };

        int n = matrix.length;

        // Step 1: Transpose (swap across diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];   // Transpose rearranges elements across the diagonal.
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row 

// If we swapped all n positions, each pair would swap twice and cancel out.
//So we stop at the middle.

//  CASE OF A WHILE LOOP 

//   for (int i = 0; i < n; i++) {
    //     int left = 0;
    //     int right = n - 1;
    
    //     while (left < right) {
        //         int temp = matrix[i][left];
        //         matrix[i][left] = matrix[i][right];
//         matrix[i][right] = temp;

//         left++;
//         right--;
//     }
//    }


// IT IS A CASE OF A TWO POINTER METHOD IN FOR LOOP \
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];   // Row reversal flips each row → producing the 90° clockwise effect.
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        // Print rotated matrix
        System.out.println("Rotated 90 degrees clockwise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
