package dsa.arrrays;

public class Majority_elements_grtr_thn_n_by_2 {
    public static void main(String[] args) {       
        //                                              BRUTE FORCE METHOD     O(N^2)
        int arr[]={2,2,3,3,1,2,2,};
        int n=arr.length;
        for(int i=0;i<arr.length;i++)   // Outer loop → picks each element one by one.
        {
            int count =0;
            for(int j=0;j<arr.length;j++)  // Inner loop → counts how many times that element appears in the array.
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                
            }
        
        if(count>n/2)  // If count > n/2 → prints that element.
                {
                    System.out.println(arr[i]);
                    break;
                }
    }
}
}
