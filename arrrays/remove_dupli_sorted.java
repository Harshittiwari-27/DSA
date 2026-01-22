package dsa.arrrays;
public class remove_dupli_sorted {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3};
        int i=0;
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[i+1]==arr[j])
            {
                i++;
            }
            else
            {
                c++;
            }
        }
        return c;
    }
}