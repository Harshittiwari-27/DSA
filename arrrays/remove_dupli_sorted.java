package dsa.arrrays;
public class remove_dupli_sorted {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3};
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                i++;
            }
            else
            {
                c++;
            }
        }
    }
}