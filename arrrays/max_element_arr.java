package dsa.arrrays;

public class max_element_arr {
    public static void main(String[] args) {
        int arr[]={1,2,5,4};
     //   int l=0;   dont intitalize with 
     int l=arr[0];
      //  int sl=-1;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>l){
            l=arr[i];
        }

       }
       
       System.out.println(l);

    }
    
}
