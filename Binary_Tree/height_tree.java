public class height_tree {
    static class  Node {
        int data;
        Node left, right;

        public Node(int data ){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    
        
    }
//                                              TO get the HEIGHT OF THE TREE

    public static int height(Node root){   // return type int becoz it will retun height 
        if(root==null){
            return 0;
        }

        // left heigh tof the tree
        int lh= height(root.left);
        int rh=height(root.right);
         return Math.max(lh, rh)+1; //   this is our max height tha ia the max of the left and the right  
    }



    public static int count(Node root){             //       to count he no of the nodes in the tree 
            if(root==null){
                return 0;
            }
            int leftCount=count{root.left};
            int rightCount=count(root.right);
            return leftCount+rightCount+1;
    }


        public static int sum(Node root){
            if(root==null){                     // base Case of recursive function 
                return 0;
            }
            int leftSum=sum(root.left);
            int rightSUm=sum(root.right);
           return  leftSum+rightSUm+root.data;              // we have return the TreeSum 
        }

    public static void main(String[] args) {                // main fuction 
        


        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
 
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));


    }

}
