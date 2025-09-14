package dsa.arrrays;
import java.util.Arrays;
import java.util.Collections;

public class seccond_max_element {
     public static void main(String[] args) {

/* 

//                                             A METHOD TO TAKE OUT THE SORT OF ARRAY
    //    Integer arr[]={1,2,3,4,5};
    //    Arrays.sort(arr,Collections.reverseOrder());
    //    System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
         int arr[]={1,2,7,9,5};
        int l=arr[0];
        int sl=-1;
       for(int i=0;i<arr.length;i++)   // O(N)
       {
        if(arr[i]>l){
            l=arr[i];
        }

       }
       for(int i=0;i<arr.length;i++)    // O(N)
       {
        if(arr[i]>sl && arr[i]!=l)
        {
            sl=arr[i];
        }
       }

       System.out.println(sl);




     }
    }
        
     */
// O(N+N) =O(2N)= O(N)


//                      OPTIMAL METHOD

 
  int arr[]={1,2,7,9,5};
        int l=0;
        int sl=-1;
        for(int i=0;i<arr.length;i++)

        {
             if(arr[i]>l)
             {
                sl=l;
                l=arr[i];

             }
             else if (arr[i]>sl && arr[i]!=l) {
                sl=arr[i];
                
             }
        }
        System.out.println(sl);
     }
    }






















 
