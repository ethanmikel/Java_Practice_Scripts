//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
        private TreeNode root;

        public BinarySearchTree()
        {
                root = null;
        }

        public void add(Comparable val)
        {
                root = add(val, root);
        }

        private TreeNode add(Comparable val, TreeNode tree)
        {
           if(tree == null)
                        tree = new TreeNode(val);
                
                Comparable treeValue = tree.getValue();
                int dirTest = val.compareTo(treeValue);
                
                
                if(dirTest < 0)
                        tree.setLeft(add(val, tree.getLeft()));
                else if(dirTest > 0)
                        tree.setRight(add(val, tree.getRight()));
                
                return tree;
        }

   public void inOrder()
        {
                inOrder(root);
                System.out.println("\n\n");
        }
        public void preOrder()
        {
                preOrder(root);
                System.out.println("\n\n");
        }
        public void postOrder()
        {
                postOrder(root);
                System.out.println("\n\n");
        }
        public void revOrder()
        {
                revOrder(root);
                System.out.println("\n\n");
        }

        private void inOrder(TreeNode tree)
        {
                if (tree != null){
                        inOrder(tree.getLeft());
                        System.out.print(tree.getValue() + " ");
                        inOrder(tree.getRight());
                }
        }
        private void preOrder(TreeNode tree)
        {
                if (tree != null){
                        System.out.print(tree.getValue() + " ");
                        preOrder(tree.getLeft());
                        preOrder(tree.getRight());
                }
        }
        private void postOrder(TreeNode tree)
        {
                if (tree != null){
                        postOrder(tree.getLeft());
                        postOrder(tree.getRight());
                        System.out.print(tree.getValue() + " ");
                        
                }
        }
        private void revOrder(TreeNode tree)
        {
                if (tree != null){
                        revOrder(tree.getRight());
                        System.out.print(tree.getValue() + " ");
                        revOrder(tree.getLeft());
                        
                        
                }
        }

        public int getNumLevels()
        {
                return getNumLevels(root);
        }

        private int getNumLevels(TreeNode tree)
        {
                if(tree==null)
                        return 0;
                else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
                        return 1+getNumLevels(tree.getLeft());
                else
                        return 1+getNumLevels(tree.getRight());
        }

        public int getWidth()
        {
                return getWidth(root);
        }

        private int getWidth(TreeNode tree)
        {
                if(tree==null)
                        return 0;
                if(tree == root)
                        return 1+getWidth(tree.getLeft()) + getWidth(tree.getRight())
;               if(getWidth(tree.getLeft())>getWidth(tree.getRight()))
                        return 1+getWidth(tree.getLeft());
                else
                        return 1+getWidth(tree.getRight());
        }
        
        public int getNumLeaves()
        {
                return getNumLeaves(root);
        }

        private int getNumLeaves(TreeNode tree)
        {
                if(tree==null)
                        return 0;
                if(tree.getLeft() == null && tree.getRight() == null)
                        return 1;
                return getNumLeaves(tree.getRight()) + getNumLeaves(tree.getLeft());
        }
        
        public int getNumNodes()
        {
                return getNumNodes(root);
        }

        private int getNumNodes(TreeNode tree)
        {
                if(tree==null)
                        return 0;
                return 1+getNumNodes(tree.getRight()) + getNumNodes(tree.getLeft());
        }
        public int getHeight()
        {
                return getHeight(root);
        }

        private int getHeight(TreeNode tree)
        {
                if(tree==null)
                        return -1;
                else if(getHeight(tree.getLeft())>getHeight(tree.getRight()))
                        return 1+getHeight(tree.getLeft());
                else
                        return 1+getHeight(tree.getRight());
        }
        public boolean isFull()
        {
                return isFull(root);
        }

        private boolean isFull(TreeNode tree)
        {
                if(tree==null)
                        return false;
                if(tree.getLeft() == null && tree.getRight() == null)
                        return true;
                if(tree.getLeft() != null && tree.getRight() != null)
                        return isFull(tree.getLeft()) && isFull(tree.getRight());
                return false;
        }


        public String toString()
        {
                return toString(root);
        }

        private String toString(TreeNode tree)
        {
                if (tree == null)
                        return "";

                return toString(tree.getLeft()) + tree.getValue() + " " + toString(tree.getRight());
        }
}