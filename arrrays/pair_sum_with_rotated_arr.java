package dsa.arrrays;

public class pair_sum_with_rotated_arr {
    public static boolean PairSum2(int arr[], int sum) {
        int bp=-1;      // breaking point or pivot point where array gets roted 
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[i+1]) // breaking point
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;   // smallest value is stored here
        int rp=bp;    // largest

        while (lp!=rp) {
            // case 1
            if(arr[lp]+arr[rp]==sum)
            {
                return true;
            }
           // case 2 
            if(arr[lp]+arr[rp]<sum)
            {
                lp=(lp+1)%n;
            }
            // case 3
            else{
                rp=(n+rp-1)%n;
            }
    
} 
return false;
    }
    public static void main(String[] args) {
        int arr[]={11,15,6,7,8,9,10};
        int sum=16;
        System.out.println(PairSum2(arr, sum));


    }
}
