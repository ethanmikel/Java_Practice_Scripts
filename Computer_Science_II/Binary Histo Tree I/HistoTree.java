//(c) A+ Computer Science
//www.apluscompsci.com

//Name -


import static java.lang.System.*;

public class HistoTree
{
private HistoNode root;

public HistoTree( ) {
   root = null;
}

public void addData(Comparable data)
{
   root = add(data, root);
}

private HistoNode add(Comparable data, HistoNode tree)
{
   if(tree == null) 
        tree = new HistoNode(data,1, null, null);
    else if(tree.getData().equals(data)) 
    {
        tree.setDataCount(tree.getDataCount()+1); 
    }
    else if(tree.getData().compareTo(data) < 0) 
            tree.setLeft(add(data, tree.getLeft()));
    else 
        tree.setRight(add(data, tree.getRight()));
   
    return tree; 
}


public HistoNode search(Comparable data)
{
   
   return search(data, root);
}


private HistoNode search(Comparable data, HistoNode tree)
{
   if(tree == null) 
       return null;
        else if(tree.getData().equals(data)) 
            return tree;
        else if(tree.getData().compareTo(data) < 0) 
            return search(data, tree.getLeft());
        else       
            return search(data, tree.getRight());

}


public String toString()
{
   return toString(root);
}


private String toString(HistoNode tree)
{
   String str = "";
   if(tree != null)
        {
            if(tree.getLeft() != null)
                str = toString(tree.getLeft()) +"\t"+ str ;
            str = tree.getData()+" - "+tree.getDataCount() + "\t"+str ;
       
            if(tree.getRight() != null)
                str = toString(tree.getRight()) +"\t"+ str ;
       
        }
       
        return str;
}
}