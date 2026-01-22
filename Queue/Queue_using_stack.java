package dsa.Queue;

import java.util.Stack;

public class Queue_using_stack {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Check if empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element (costly enqueue)
        public static void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push new element into s1
            s1.push(data);

            // Move everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element (O(1))
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.pop();
        }

        // Peek front element (O(1))
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
    }

    // Test the Queue
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front element: " + q.peek()); // 10
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Front element: " + q.peek()); // 20
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        System.out.println("Removed: " + q.remove()); // Queue is empty
    }
}
