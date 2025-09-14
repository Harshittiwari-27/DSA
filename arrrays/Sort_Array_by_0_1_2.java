package dsa.arrrays;

public class Sort_Array_by_0_1_2 {
    public static void main(String[] args) {
        int c0=0;
        int c1=0;
        int c2=0;
        int arr[]={0,1,2,1,2,1,2,0,0,0,1};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c0++;

            }
            else if(arr[i]==1)
            {
                c1++;
            }
            else
            {
                c2++;
            }

            }
           System.out.println(c0+" "+" "+c1+" " +c2);
          
}


            
            }
        
    
    
