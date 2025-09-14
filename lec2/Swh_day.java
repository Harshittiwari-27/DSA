//  >>>>----------------------->>>>>>>>>        switch day program


package dsa.lec2;
import java.util.Scanner;

public class Swh_day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day");
        int day=sc.nextInt();

// switch (day) {
//     case 1:
//         System.out.println("monday");
//         break;
//     case 2:
//         System.out.println("tuesday");
//         break;
//     case 3:
//         System.out.println("wednesday");
//         break;
//     case 4:
//         System.out.println("thursaday");
//         break;
//     case 5:
//         System.out.println("friday");
//         break;
//     case 6:
//         System.out.println("saturday");
//         break;
//     case 7:
//         System.out.println("sunday");
//         break;

//     default:
//         System.out.println("enter the valid range of no");

  


//    This is correct syntax for a switch expression using Java 14 or later, specifically with 
//     multiple labels in one case using commas and ->.


     switch(day){
        case 1,2,3,4,5 -> System.out.println("weekday");
        case 6,7 ->  System.out.println("weekend");
     }
    }
    }
    

