package dsa.Stack;
import java.util.*;

public class PrintStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push some numbers into the stack
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        // Printing all stack elements from top to bottom
        System.out.println("Printing all stack elements (top to bottom):");

        // Loop runs until stack becomes empty
        while (!stack.isEmpty()) {
            // peek() shows the top element without removing it
            System.out.println(stack.peek());

            // pop() removes the top element
            stack.pop();
        }
    }
}
