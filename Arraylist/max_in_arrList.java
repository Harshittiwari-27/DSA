package dsa.Arraylist;

import java.util.ArrayList;

public class max_in_arrList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(2);                        
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(4);
        // int large=list.get(0);
        int max=Integer.MIN_VALUE;
         for(int i=0;i<list.size();i++)
         {
            // if (list.get(i)>large) {
            //     large=list.get(i);
                
            // }
            max=Math.max(max,list.get(i));
         }
         System.out.println(max );

    
}
}
