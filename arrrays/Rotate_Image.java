package dsa.arrrays;

public class Rotate_Image {
    public static void main(String[] args) {
       // int matrix[][]=new int[3][3];
       int[][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
        };
        int n=matrix.length;
        int k[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                k[j][(n-1)-i]=matrix[i][j];
            }
        }

              // print the rotated matrix
              for(int i=0;i<n;i++)
              {
                for(int j=0;j<n;j++)
                {
                    System.out.print(k[i][j]+" ");
                }
              
              System.out.println();



    }
    
}
}
