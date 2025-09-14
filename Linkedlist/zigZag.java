
package dsa.Linkedlist;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class zigZag {
    Node head;

    // Insert at end
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Zig-Zag reordering
    public void zigzag() {
        if (head == null || head.next == null) return;

        // 1. find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // 2. reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. alternate merge - zigzag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // update
            left = nextL;
            right = nextR;
        }
    }

    // Main
    public static void main(String[] args) {
        zigZag ll = new zigZag();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original List:");
        ll.print();

        ll.zigzag();

        System.out.println("ZigZag List:");
        ll.print();
    }
}
