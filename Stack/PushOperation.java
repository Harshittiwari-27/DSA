package dsa.Stack;
import java.util.*; // Importing Java's Stack class

public class PushOperation {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing (adding) elements to the stack (top)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying confirmation and current stack
        System.out.println("Elements pushed successfully!");
        System.out.println("Current Stack: " + stack);
    }
}
