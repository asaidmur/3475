 public class BT {
	 
     private BTNode root;
 
     /* Constructor */
     public BT() {
         root = null;
     }
     
     /* Function to check if tree is empty */
     public boolean isEmpty() {
         return root == null;
     }
     
     /* Functions to insert data */
     public void insert(int data) {
         root = insert(root, data);
     }
     
     /* Function to count number of nodes */
     public int countNodes() {
    	 return countNodes(root);
     }
     
     /* Function to search for an element */
     public boolean search(int val) {
    	 return search(root, val);
     }
     
     /* Function for inorder traversal */
     public void inorder() {
         inorder(root);
     }
     
     /* Function for preorder traversal */
     public void preorder() {
         preorder(root);
     }
     
     /* Function for postorder traversal */
     public void postorder() {
         postorder(root);
     }
     
     
     
     
     
     
     
     /* Function to insert data recursively */
     private BTNode insert(BTNode node, int data) {
         if (node == null) {
        	 node = new BTNode(data);
         }
         else {
             if (node.getRight() == null) {
                 node.right = insert(node.right, data);
             }
             else {
            	 node.left = insert(node.left, data);             
             }
             
         }
         
         return node;
     }     
     
     /* Function to count number of nodes recursively */
     private int countNodes(BTNode r) {
         if (r == null) {
             return 0;
         }
         else {
             int count = 1;
             count += countNodes(r.getLeft());
             count += countNodes(r.getRight());
             return count;
         }
     }
     
     /* Function to search for an element recursively */
     private boolean search(BTNode r, int val) {
         if (r.getData() == val) {
             return true;
         }
         if (r.getLeft() != null) {
             if (search(r.getLeft(), val)) {
                 return true;
             }
         }
         if (r.getRight() != null) {
             if (search(r.getRight(), val)) {
                 return true;
             }
         }
         return false;         
     }
     
  
     private void inorder(BTNode r) {
         if (r != null) {
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
     
   
     private void preorder(BTNode r) {
         if (r != null) {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }

     private void postorder(BTNode r) {
         if (r != null) {
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     }     
 }