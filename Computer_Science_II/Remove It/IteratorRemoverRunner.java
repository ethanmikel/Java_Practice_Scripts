//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
      IteratorRemover o1 = new IteratorRemover("a b c a b c a","a");
      o1.remove();
      System.out.println(o1);
                
      IteratorRemover o2 = new IteratorRemover("a b c d e f g h i j x x x x","x");
      o2.remove();
      System.out.println(o2);
                
      IteratorRemover o3 = new IteratorRemover("1 2 3 4 5 6 a b c a b c","b");
      o3.remove();
      System.out.println(o3);
	}
}