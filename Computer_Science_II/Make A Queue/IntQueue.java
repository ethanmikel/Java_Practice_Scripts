//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue {
   private ArrayList<Integer> listOfInts;


   public IntQueue() 
   {
      listOfInts = new ArrayList<Integer>();
   }

   public void add(int item)
   {
      listOfInts.add(item);
   }

   public int remove()
   {
      if(!isEmpty()) {
         return listOfInts.remove(0);
      } else {
         return -1;
      }

   }

   public boolean isEmpty()
   {
      return listOfInts.isEmpty();
   }

   public int peek()
   {
      if(!isEmpty()) {
         return listOfInts.get(0);
      } else {
         return -1;
      }
   }

   public String toString()
   {
      StringBuilder sb = new StringBuilder();

      if(listOfInts.isEmpty()) {
         sb.append("[]");
         return sb.toString();
      }

      sb.append("[");
      int max = listOfInts.size() - 1;
      for (int i = 0; i < listOfInts.size(); i++) {
         if(i == max) {
            sb.append(listOfInts.get(i));
         } else {
            sb.append(listOfInts.get(i)+",");
         }
      }
      sb.append("]");
      return sb.toString();    
   }
}