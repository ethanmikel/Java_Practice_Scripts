//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
   private LinkedList<Integer> list;

   public JavaLinkedList()
   {
      list = new LinkedList<Integer>();
   }
   public JavaLinkedList(int[] nums)
   {
      list = new LinkedList<Integer>();
      for(int num : nums)
      {
         list.add(num);
      }
   }
   public double getSum( )
   {
      double total=0;
      for (int i = 0; i < list.size(); i++) {
         total = total + list.get(i);
      }
      return total;
   }
   public double getAvg( )
   {
      double total=0,avg;
      for (int i = 0; i < list.size(); i++) {
         total = total + list.get(i);
      }
      avg=total/list.size();
   return avg;
   }
   public int getLargest()
   {
      int largest=list.get(0);
      for (int i = 0; i < list.size(); i++) {
         if(largest<list.get(i));
            largest=list.get(i);
         }
      return largest;
    }
   public int getSmallest()
   {
      int smallest=list.get(0);
      for (int i = 0; i < list.size(); i++) {
         if(smallest>list.get(i))
         smallest=list.get(i);
      }
      return smallest;
   }
   public String toString()
   {
      String output="SUM: "+getSum()+"\nAVERAGE: "+getAvg()+"\nSMALLEST: "+getSmallest()+"\nLARGEST: "+getLargest()+"\n\n";
      return output;
   }
}