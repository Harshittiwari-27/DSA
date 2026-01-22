// public package dsa.Binary_Tree;
import java.util.*;
public class preorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

   //                                         Binary Treee class 
   static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int nodes[]){  // node will be returned that is root 
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);  // equal to jodne ka kaam kr rha hai
        newNode.right=buildTree(nodes);

        return newNode;
    }
    //                                           this is the tree traversal  PREORDER
    public static void preorder(Node root ){   // O(n)
        System.out.print(root.data+"  ");
        // base Case 
        if(root==null){      // agr root null h to simply return ho jaao               
            return ; 
        }
        preorder(root.left);
        preorder(root.right);
    }

    //                        THIS IS THE TREE TRAVERSAL  IN ORDER (LEFT SUBTREE, ROOT , RIGHT SUBTREE)

    public static void inorder(Node root){
       if(root ==null){    // base case 
        return; 
       }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //                         THIS IS THE TREE TRAVERSAL POST ORDER( LEFT SUBTREE, RIGHT SUBTREE, ROOT )
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }

    //                                               THIS IS THE LEVEL ORDER TRAVERSAL
    public static void levelOrder(Node root ){
        if(root==null){   // BASE CASE
            return;
        }
        // CREATEING THE QUEUE 
        Oueue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);  // null added becoz to show the next line 

        while(!q.isEmpty()){   // jab tak queue khali nhi ho jati 
            Node currNode=q.remove();       // ek ek karke bahar nikalenge 
            if(currNode==null){         // currNode nall h next line print 
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{               // agr queue me elements bache h to add kr do queue me 
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data);          // agr null nhi h to data print kr do
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

    }
   } 

   public static void main(String args[]){
    int nodes[]={1,2,4,-1,-1,5,-1,3,-1,6}
    BinaryTree tree =new BinaryTree();
    Node root= tree.buildTree(nodes);      // tree me buildtree ko call kr diya jisme pass ho gya build tree ka data
    // System.out.println(root.data);
    
    tree.preorder(root);
     tree.inorder(root);
     tree.postorder(root);
    tree.levelOrder(root);
 
   }
    
}