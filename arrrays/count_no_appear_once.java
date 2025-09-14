package dsa.arrrays;

public class count_no_appear_once {
    public static void main(String[] args) {

//                                                BRUTE METHOD

    //     int arr []={1,1,2,3,3,4,4};
    //     int num;
      
    //     int count;
    //     for(int i=0;i<arr.length;i++)  // picking the element one by one
    //     {
    //         num=arr[i];
    //         count=0; // we intialize the count =0 here so that every time it gets reset 

    //         for(int j=0;j<arr.length;j++)  // doing the linear search
    //         { 

    //             if(arr[j]==num)
    //             {
    //                 count++;
    //             }
    //         }
    //         if(count==1)
    //         {
    //             System.out.println(num);
    //         }
    //     }

    // }




   // ------------------------------------------ OPTIMAL METHOD
   
    int arr []={1,1,2,3,3,4,4};
    int xor=0;
    for(int i=0;i<arr.length;i++)
    {
        xor=xor^arr[i];
    }
    System.out.println(xor);
    
}
}
