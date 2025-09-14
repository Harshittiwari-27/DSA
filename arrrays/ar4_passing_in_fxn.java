package dsa.arrrays;

import java.util.Arrays;

public class ar4_passing_in_fxn {
    
    public static void main(String[] args) {

        int []nums={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
/*
change is a method.
int[] arr is the parameter → It means this method expects an array of integers.

arr is the name of the parameter.

int[] is the type, meaning "array of integers".
Inside the method, arr refers to the same array object as nums.


 */



    static void change(int[]arr)
    {
        arr[0]=50;
    }
}
