package dsa.arrrays;

public class sum_element_arr {
    public static void Sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       // System.out.println(Sum(arr););
       Sum(arr);
    
    
}
}
