package dsa.functions_methods;
 // Scope means where you can access (use) your variables or methods in your code.


public class scope5 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
      //  System.out.println(num);   not accessible
    }
    static void random(){
        int num =98;
       // System.out.println(a); // now her we cant get access to the a becoz its inside the another fxn

       System.out.println(num); // it is accessible as it is from the same fxn
    }
    
}
