package dsa.arrrays;

public class ar5_2D_array {
    public static void main(String[] args) {
        /*

         1 2 3
         4 5 6
         7 8 9


         */

  //  int[][] arr=new int[3][3];
 // int[][] arr=new int[3][];   // it is not necessary to mention the colmns size   
    int arre[][]={

      {1,2,3},    // 0th index
      {4,5},  // Java allows jagged arrays, where each row can have a different number of columns. 
      {7,8,9}   // 2nd index -> arre[2]={7,8,9}

    };
    System.out.println(arre[0][2]);

    // Q. print the whole third row  -->>  {7,8,9}
    for (int val : arre[2]) {
    System.out.print(val + " ");
}

                         

                                
    }
    
}
