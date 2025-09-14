package dsa.arrrays;

public class len_longest_subarr_sum_k {
    public static void main(String[] args) {
       int[] a = {1, 2, 3, 1, 1, 1, 1, 2};  // Example array
        int n = a.length;
        int p = 5;   // Target sum
        int len = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)

                {
                    sum+=a[k];
                }
                if(sum==p)
                {
                     len = Math.max(len, j - i + 1);
                }
            }

        }
        System.out.println("Length of longest subarray with sum " + p + " = " + len);

    }
    
}
