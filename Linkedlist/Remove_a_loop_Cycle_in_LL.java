package dsa.Linkedlist;


class Check {
    int val;
    Check next;
    
    Check(int val) {
        this.val = val;
        this.next = null;
    }
}


public class Remove_a_loop_Cycle_in_LL {
    public static void RemoveCycle(Check head)
    {
        // Cycle detect
        Check slow=head;
        Check fast=head;
        boolean cycle =false;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                cycle=true;
                break;
            }
        }
         if(cycle ==false) // cycle exist hi nhi kar rhi hai to remove kya karoige
         {
            return;
         }

         // if got the cycle then move to the next steo that is ;
        // find meeting point
        slow =head;
        Check prev=null ; // ek node le lo prev jo track kaarega fast ke piche wale ko
        while(slow!=fast)
        {
            prev=fast;   // / store last node before meeting point
            slow=slow.next;
            fast=fast.next;
        }


        // remove cycle -> last.next =null    Step 3: Break the cycle
        prev.next=null;

    }

    // Utility function to print list (for testing)
    public static void printList(Check head) {
        Check temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
     public static void main(String[] args) {
        // Example: create a list with a cycle
        Check head = new Check(1);
        head.next = new Check(2);
        head.next.next = new Check(3);
        head.next.next.next = new Check(4);
        head.next.next.next.next = head.next; // cycle at node 2
       // printList(head);
        RemoveCycle(head);

        printList(head); // Output: 1 -> 2 -> 3 -> 4 -> null
    
}
}
