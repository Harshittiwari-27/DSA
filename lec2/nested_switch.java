package dsa.lec2;
import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id ");
        int empid=sc.nextInt();
        System.out.println("Enter the departement  ");
        String departement =sc.next();

        switch (empid) {
            case 1:
                System.out.println("harsh");
                break;

            case 2:
                System.out.println("abhay");
                break;
            case 3:
                System.out.println("employee no 3");
                switch (departement) {
                    case "IT":
                        System.out.println("IT DEPARTEMENT");
                        break;
                    case "management":
                        System.out.println("MANAGEMENT ");
                    default:
                        System.out.println("NO DEPARTEMENT ADDED");
                }
                break;
            default:
                System.out.println("enter correct value");
                break;
        }
        
    }    
}
