// package dsa.Linkedlist;

// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

// public class Merge_Sort {
    
//     // Get middle node (using slow-fast pointer)
//     private Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow; // slow becomes mid
//     }

//     // Merge two sorted linked lists
//     private Node merge(Node head1, Node head2) {
//         Node dummy = new Node(-1);
//         Node temp = dummy;

//         while (head1 != null && head2 != null) {
//             if (head1.val <= head2.val) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }

//         if (head1 != null) temp.next = head1;
//         if (head2 != null) temp.next = head2;

//         return dummy.next;
//     }

//     // Merge Sort function
//     public Node mergeSort(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         // Step 1: Find mid
//         Node mid = getMid(head);

//         // Step 2: Split into left and right
//         Node rightHead = mid.next;
//         mid.next = null;

//         // Step 3: Sort left and right
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         // Step 4: Merge
//         return merge(newLeft, newRight);
//     }

//     // Print Linked List
//     public void print(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // Main method
//     public static void main(String[] args) {
//         Merge_Sort ms = new Merge_Sort();

//         // Creating linked list manually
//         Node head = new Node(5);
//         head.next = new Node(4);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(2);
//         head.next.next.next.next = new Node(1);

//         System.out.println("Original List:");
