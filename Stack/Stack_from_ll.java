package dsa.Stack;

public class Stack_from_ll {
    static class Node
    {
        int data ;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            
        }
    }
    static class Stack
    {
        static Node head=null;

        // check empty of the list 

        public static boolean isEmpty()
        {

            return head ==null;  // if this is equals this means there is no head in the linkelist so return true / false
        }

        // push 
        public static void  push(int data )
        {
            Node newNode =new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return ;
            }

            // if the linkedlist is not emoty what we do is me make the newNode.next = head;
            newNode.next=head;  // new node ke next me ye  headd ki value ko store karaya 
            head=newNode; // head me naye node store ho jayega
        }

        // pop 
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top =head.data;   // // store current top element
            //              So instead of deleting it physically, you just move the head reference one step ahead.
            head=head.next;  // head moves to the second node:
            return top;
        }

        // peek 
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data; 
        }
        
        
    }

        public static void main (String []args)
    {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())   // ye kaam tab tak karenge jab tak hamara stack khali nhi ho jata
        {
           System.out.println(s.peek()); // print the top element
            s.pop();
           // System.out.println(Stack.list);  // shows remaining elements
        }
    
}
}
