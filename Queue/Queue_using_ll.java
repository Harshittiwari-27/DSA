package dsa.Queue;

public class Queue_using_ll {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class using Linked List
    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add (enqueue)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;

            // If only one element is left
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // Peek (front element)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        // Display all elements
        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        q.display();  // 10 20 30

        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("Removed: " + q.remove()); // 10
        q.display(); // 20 30

        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        System.out.println("Removed: " + q.remove()); // Queue empty

        System.out.println("Is Empty? " + q.isEmpty()); // true
    }
}
