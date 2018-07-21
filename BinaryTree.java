import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryTree
 {
     public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BT BinaryTree = new BT(); 
        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");          
        String Continue;        
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
 
            int choice = scan.nextInt(); 
            try {
				
			
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                BinaryTree.insert( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter integer element to search");
	                System.out.println("Search result : "+ BinaryTree.search( scan.nextInt() ));
	                break;                                          
	            case 3 : 
	                System.out.println("Nodes = "+ BinaryTree.countNodes());
	                break;     
	            case 4 : 
	                System.out.println("Empty status = "+ BinaryTree.isEmpty());
	                break;            
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
            } catch (InputMismatchException e) {
				System.out.println(e);
				break;
			}
            /*  Display tree  */ 
            System.out.print("\nPost order : ");
            BinaryTree.postorder();
            System.out.print("\nPre order : ");
            BinaryTree.preorder();
            System.out.print("\nIn order : ");
            BinaryTree.inorder();
 
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            Continue = scan.next();                     
        } while (Continue.equalsIgnoreCase("y"));   
        scan.close();
    }
 }