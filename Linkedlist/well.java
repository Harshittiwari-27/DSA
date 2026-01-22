package dsa.Linkedlist;

 
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("MyLinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class well {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // ✅ using your custom class
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList();                       // Output: 30 -> 20 -> 10 -> null
    }
}


