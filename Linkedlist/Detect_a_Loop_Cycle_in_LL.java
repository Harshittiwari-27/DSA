package dsa.Linkedlist;

class Check {
    int val;
    Check next;
    
    Check(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Detect_a_Loop_Cycle_in_LL {


    public static boolean hasCycle(Check head) {
        if (head == null) return false;

        

        Check slow = head;
        Check fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {         // collision → cycle exists
                return true;
            }
        }
        return false; // reached null → no cycle
    }

    public static void main(String[] args) {
        // Example: Create a linked list with a cycle
        Check head = new Check(1);
        head.next = new Check(2);
        head.next.next = new Check(3);
        head.next.next.next = new Check(4);
         head.next.next.next.next = head.next; // creates a cycle      1->2->3->4->1

        System.out.println(hasCycle(head)); // Output: true
    }
}

    

