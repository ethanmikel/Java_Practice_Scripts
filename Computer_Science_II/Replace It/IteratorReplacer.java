//(c) A+ Computer Science
//www.apluscompsci.com

// I have removed unnecessary imports. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorReplacer
{
   private ArrayList<String> list;
   private String toRemove, replaceWith;

   public IteratorReplacer(String line, String rem, String rep)
   {
      String[] words = line.split(" ");
      this.list = new ArrayList<String>( Arrays.asList(words) );
      this.toRemove = rem;
      this.replaceWith = rep;
   }

   public void replace()
   {
      ListIterator<String> li = list.listIterator();
      while (li.hasNext()) {
         if( li.next().equalsIgnoreCase(toRemove) ) {
         li.set(replaceWith);
         }
      }
   }
   
   public String toString()
   {
      return list.toString()+"\n\n";
   }
}