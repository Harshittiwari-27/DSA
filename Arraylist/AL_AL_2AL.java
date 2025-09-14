package dsa.Arraylist;

import java.util.ArrayList;

public class AL_AL_2AL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
       // System.out.println(mainList.add(list));
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
      //  System.out.println(mainList.add(list2));
        mainList.add(list);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> currList = mainList.get(i); // this will get the whole list
            for(int j=0;j<currList.size();j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);



    }
    
}
