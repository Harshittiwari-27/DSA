package dsa.Linkedlist;



//import java.util.LinkedList;

public class syntax {
   // inside the linkedlist class we have created thee node class
                                // rembere there is only one HEAD AND ONLY ONE TAIL inside the linkelist 
    public static class Node{

    int data ;
    Node next;
    //         This is the constructor:
    public Node(int data )
    {
        this.data=data;     // stores the value in the node.
        this.next=null;     // when new node is created, it doesn’t point anywhere yet
        
    }
}
public static Node head; 
public static Node tail;
public static int size;

public void addFirst(int data)
{
    Node newNode=new Node(data);
    size++;
    // if my linkedlist is emoty what will ha
    if(head==null){
        head=tail=newNode;  // so both the head and the tail is pointing to the same node newNode
        return;
    }


                        // these all are the steps when linkedlist have more than one nodes
    // step1= create new node
   // Node newNode=new Node(data);   unlock this when doing for more than one nodes

    // step 2- newNode next =head ----  newNode ka next point karega hamare old head ko
    newNode.next=head;   // step where i have link the one node to the other

    //step 3 -- head =newNode
    head=newNode;




}


//================================================================================

public void addLast(int data)   
{
    Node newNode=new Node(data);   // creating the new Node
    size++;
    if(head==null)          // base case
    {
        head=tail=newNode;
        return;
    }
    tail.next=newNode;   // tail ke next ko point kara do apne naye node ki taraf(newNode)
    tail=newNode; //  apne naye node ko hi tail bana do ---- so tail hamra ban gya naya node 
} 


//=====================================================================
public void print()
{
    if(head ==null)
    {
        System.out.println("LinkeList is empty");
        return;
    }
    Node temp=head;
   
    while(temp!=null)
    {
        System.out.print(temp.data+"-> ");
        temp=temp.next;

    }
    System.out.println("null");
}



                                      // inseritng the element in the middle of the linkedlist




public void add(int idx,int data)   // Method to insert data at position idx.
{
    // if(idx==0)
    // {
    //     addFirst(data);
    //     return;
    // }
    Node newNode=new Node(data);   // Create a new node with the given data.
    Node temp=head;       // Start traversing from the head node.
    int i=0;             //temp initially points to head (1)  idx=0;
    while (i<idx-1) {     // Stop temp at the node just before the target index
        temp=temp.next;
        i++;
        
    }
    newNode.next=temp.next;  // Link newNode to the node that comes after temp.
    temp.next=newNode;

}

                  //  removal of the first ekemtnt 
public int removeFirst()   // it is a method,  It is not an object.
{
    if(size==0)
    {
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;    // it is the smallest (most negative) number that an int can hold.
    }
    else if (size==1) {
        int val=head.data;
        size=0;
        head=tail=null;
        return val; 
        
    }
    int val =head.data;  // what we will remove is the data of the first element    // get the data of first node
    size--;
    head=head.next;   //  // move head to next node (removes first node)
    return val;      // returned the value of the  removed element
}  
// ==================================================================================================================================================

public int removeLast(){
    if(size==0)
    {
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
     }
    else if(size==1)
    {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    // if I want to go to the prev index ie. i=size-2;   becoz last index is i=size-1;   where as prev index goes to  i=size-2; 
    Node prev=head;
    for(int i=0;i<size-2;i++)
    {
        prev=prev.next;
    }
    int val=prev.next.data; //  we stored the data which we want to delete ---- (prev.next) mtlb tail .data mtlb tail ka data hamne store kar liya val me  prev.next.data = value of last node.
    prev.next=null;   // prev ke next ko null bana diya 
    tail=prev;     // tail ko assign kar diya prev ki value ko  //  update tail to point to the new last node
    size--;
    return val;

}

//==========================================================================================================
public  int Search(int key)
{
   // int key=2;
    Node temp=head;
    
    int index=0;
    while(temp!=null)
    {
        if(temp.data==key)
        {
            return index;
        }
        temp=temp.next;
        index++;while (ww) {
            
        }
    }
   return -1;
}

//=====================================================================================================

public int  helper(Node head, int key)  // weh have made a helper fxn that does all the recursive task
{
        if(head==null)
        {
            return -1;
                }
        if(head.data==key)
        {
            return 0;

        }
            int indx=helper(head.next, key);
            if(indx==-1)
            {
                return -1;
            }
            return indx+1;

            }
            public int recSearch(int key)

            {
                return helper(head,key);
    }


    //=======================================================================================================================

public void reverse()    // O(N  )
{
    Node prev=null;
    Node curr=tail=head; 
    Node next;

    while(curr!=null)
    {
        next=curr.next;
        curr.next =prev;
        prev=curr;
        curr=next;
        }

    head=prev;  // update tehe head value

}
//=====================================================================================
public void delteNthfromEnd(int n)
{
    // calculate size
    int sz =0;
    Node temp=head;
    while(temp!=null)
    {
        temp=temp.next;
        sz++;
    }
    if(n==sz)
    {
        head=head.next; // remove first 
        return;


    }
    // sz-n
    int i=1;
    int iTofind=sz-n;
    Node prev=head;
    while(i<iTofind)
    {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

}

//================================================================================================

public Node findMid(Node head)
{
    Node slow =head; //  Now you are creating references (pointers) slow and fast.
    Node fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;  // +1  // move one step
        fast=fast.next.next;  // +2  // move two step
    }
    return slow;  // slow is my midNode
}

public boolean checkPalindrome()
{
    if(head==null && head.next==null)  //  head.next ==null ho gaya eska mtlb linkelist ke andr sirf ek hi single element hai  .-- head== null mtlb linkelist is empty
    {
        return true;
    }
    // step 1 --find mid
    Node midNode=findMid(head); // called the fxn mid node

    // step 2 - reverse 2nd half
    Node prev=null;
    Node curr=midNode; //  as we have to reverse of the 2nd half  taht why we are starting the curr aas the midNode
    Node next;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node right =prev;     // right half head 
    Node left =head;
    
    // step 3 - check left half and right half
    while(right !=null)
    {
        if(left.data != right.data) 
        {
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;  // agr ek bhi value msimatch nhi hua to true hai 

}

public static void main(String[] args) {
    syntax l1=new syntax();
    // l1.head=new Node(1);
    // l1.head.next=new Node(2)               // ye point kar raha hai jaha pr new data store  hua h
   // l1.print();
    l1.addFirst(2);
    // l1.print();
    l1.addFirst(1);
   //  l1.print();
    l1.addLast(2);
   //  l1.print();
    l1.addLast(1);
    l1.add(2, 3); //     1->2->3->4->5   // we have added the element 3 at the posn  2 in the linkedlist e
     l1.print();
    // System.out.println(l1.size);   // it gives the size of the linkedlist ending with the mull
    // l1.removeFirst();             // we have called the remove first and then make the linkedlist print
    // l1.print();
    // l1.removeLast();
    // l1.print();
    // System.out.println(l1.size);   // prints the final size of the list after removing first and teh last

    //  System.out.println(l1.Search(3));
    // System.out.println(l1.Search(10));

   // System.out.println(l1.recSearch(3));   // searched for mode 3
    // System.out.println(l1.recSearch(10));   // 

    // l1.reverse();
    // l1.print();
 
    //  l1.delteNthfromEnd(3);
    //  l1.print();

    System.out.println(l1.checkPalindrome());
}
}
    

