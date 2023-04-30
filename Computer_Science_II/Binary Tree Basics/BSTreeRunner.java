//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
                BinarySearchTree t = new BinarySearchTree();
                t.add(90);
                t.add(80);
                t.add(70);
                t.add(85);
                t.add(100);
                t.add(98);
                t.add(120);
                System.out.println("In Order");
                t.inOrder();
                System.out.println("Pre Order");
                t.preOrder();
                System.out.println("Post Order");
                t.postOrder();
                System.out.println("Rev Order");
                t.revOrder();
                
                System.out.println("Height " + t.getHeight());
                System.out.println("Width " + t.getWidth());
                System.out.println("Leaves " + t.getNumLeaves());
                System.out.println("Nodes " + t.getNumNodes());
                System.out.println("Levels " + t.getNumLevels());
                System.out.println("String " + t.toString());
                System.out.println("Full " + t.isFull());
                
                
 
   }
}