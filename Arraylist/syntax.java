package dsa.Arraylist;

import java.util.ArrayList;

public class syntax {
    public static void main(String[] args) {
                               // < inside this we write the type of the data theat we want to store  in the arraylist>
        ArrayList<Integer>list =new ArrayList<>(); 

        list.add(1);                           // time complexity in adding the on is O(1)
         list.add(2);
         list.add(3);
         list.add(4);

        //  list.add(1,7);                         // add the  elment 7 at index 1   O(N)
        //  System.out.println(list);

         // Get operation  :---  T C= O(N)
        //  int element=list.get(2);             // used to get the elemet of that index
        //  System.out.println(element);

        //  // delete or remove  :-----
        // int j= list.remove(2);
        //  System.out.println(j);

        //  // set operation
        //  list.set(3, 10);
        //  System.out.println(list);

        //  // comtains
        //  System.out.println(list.contains(1));          // they return the boolean values
        //  System.out.println(list.contains(11));

        // SIZE OF THE ARRAYLIST    ye ek method hai ye ek fxn hai
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)                     // to take out the size
        {
            System.out.print(list.get(i)+ " ");
        }


    }
    
}
