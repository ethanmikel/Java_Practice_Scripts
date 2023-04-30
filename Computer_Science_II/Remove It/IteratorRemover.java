//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover {

   private ArrayList<String> list;
   private String toRemove;
   
   public IteratorRemover(String line, String rem) 
   {
      this.setTest(line, rem);
   }
   
   public void setTest(String line, String rem)
   {
      String words[] = line.split(" ");
      list = new ArrayList<String>(Arrays.asList(words));
      toRemove = rem;
   }

   public void remove() 
   {
      Iterator it = list.iterator();
      String str = "";
      while(it.hasNext()) {
         str = (String)it.next();
         if(str.equals(this.toRemove)) {
            it.remove();
         }
      }
   }

   public String toString()
   {
      String res = String.join(", ", list);
      return "[" + res + "]";
   }
}
