package dsa.arrrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leader_array {
    public static void main(String[] args) {   //               BRUTE  O(N^2)  S(N)
        int arr[]={16, 17, 4, 3, 5, 2};
        int n=arr.length;
        List<Integer> leaders = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            boolean isleader=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                   isleader=false;
                    break;
                }
            }
                if(isleader)
                {

                    leaders.add(arr[i]); // collect leader
                }
                
            }
             // Convert List to array and print
           System.out.println(Arrays.toString(leaders.toArray()));  // The method .toArray() converts the ArrayList into an array.
                
            }

        }
    
    

