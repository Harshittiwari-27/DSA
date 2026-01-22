package dsa.Stack;
import java.util.*;

public class PopOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Before Pop: " + stack);

        // Pop removes the top element and returns it
        int popped = stack.pop();

        // Show which element was removed
        System.out.println("Popped element: " + popped);

        // Show the stack after popping
        System.out.println("After Pop: " + stack);
    }
}
