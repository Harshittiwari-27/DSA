package dsa.arrrays;

import java.util.Arrays;

public class Rearange_Array_elements_by_sign {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        int pos=0; 
        int neg=1;
        int ans[]=new int[n];  // declaration of the emoty array
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                ans[neg]=arr[i];
                neg=neg+2;
            }
            else
            {
                ans[pos]=arr[i];
                pos=pos+2;
            }
        }
        System.out.println(Arrays.toString(ans));


    }
    
}
