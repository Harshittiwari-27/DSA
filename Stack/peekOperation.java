package dsa.Stack;
import java.util.*;

public class peekOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push a few elements
        stack.push(100);
        stack.push(200);
        stack.push(300);

        // Print the full stack
        System.out.println("Stack: " + stack);

        // Peek returns the top element but does not remove it
        int top = stack.peek();
        System.out.println("Top element (peek): " + top);

        // Stack remains unchanged after peek
        System.out.println("Stack after peek: " + stack);

          // Display the stack
        System.out.println("Stack: " + stack);

        // size() returns the total number of elements currently in the stack
        System.out.println("Current size of stack: " + stack.size());
    }
}
