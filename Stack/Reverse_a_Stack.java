package dsa.Stack;

import java.util.Stack;

public class Reverse_a_Stack {

    // 🧩 Function to push an element at the bottom of the stack (recursive)
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: if stack is empty, push the element
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Remove top element and hold it in 'top'
        int top = s.pop();

        // Recursive call to push 'data' at bottom
        pushAtBottom(s, data);

        // Put the top element back after bottom element is inserted
        s.push(top);
    }

    // 🔁 Function to reverse the stack (recursive)
    public static void reverseStack(Stack<Integer> s) {
        // Base case
        if (s.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = s.pop();

        // Reverse the remaining stack
        reverseStack(s);

        // Push the removed element at the bottom
        pushAtBottom(s, top);
    }

    // 🖨️ Function to print all stack elements
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // 🧠 Main function
    public static void main(String[] args) {
        // Create a stack and push elements
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack (Top to Bottom):");
        System.out.println(s); // Prints [1, 2, 3] (3 is top)

        // Reverse the stack using recursion
        reverseStack(s);

        System.out.println("\nReversed Stack (Top to Bottom):");
        printStack(s); // Prints elements in reversed order (1 at top)
    }
}
