package dsa.arrrays;

public class maximum_consecutive_1 {
    public static void main(String[] args) {
        //System.out.println("ENter the string");
        int arr[]={1,1,0,1,1,1,1,1,1,0,0,1,1};
        int maxi=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                if(count>maxi)
                {
                    maxi=count;
                }

            }
            else{
                count=0; // as soon as the zero is encountered the count must be reset to 0
            }
        }
        System.out.println("The max no of consecutive array is "+maxi);



    }
    
}
