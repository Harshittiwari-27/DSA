package dsa.arrrays;

public class reverse_element_arr {

    public static void Reverse(int []arr)
    {
         for(int i=arr.length-1;i>=0;i--)
         {

             System.out.println(arr[i]+" ");
         }
       
         System.out.println();
    }
        public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Reverse(arr);
    }
    
}
