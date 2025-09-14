package dsa.arrrays;

public class count_even_odd_arr {
   // public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
        // int e_count=0;
        // int o_count=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]%2==0){
        //         e_count++;

        //     }
        //     else
        //     {
        //         o_count++;
        //     }
        // }
        // System.out.println("Even: "+e_count+ " Odd: "+o_count);

        public static void countEvenOdd(int[] arr) {
         int even = 0, odd = 0;

        for (int num : arr) {  // enhanced for loop (cleaner)
            if (num % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        countEvenOdd(arr);












    }
    
}
