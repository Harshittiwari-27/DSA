package dsa.arrrays;

public class chk_arr_sorted {

    public static boolean Sorted(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                
            }
            else
            {
                return false;
            }

    }
    return true;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7};
        System.out.println(Sorted(arr));
        
        
        }
    }
    

