//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Mikel

import java.util.ArrayList;

public class IntStack {
   private ArrayList<Integer> listOfInts;

   public IntStack() {
      listOfInts = new ArrayList<Integer>();
   }
   public void push(int item) {
      listOfInts.add(item);
   }
   public int pop() {
      int poppedItem = 0;
      if(!isEmpty()) {
         int sizeOfList = listOfInts.size();
         poppedItem = listOfInts.remove(sizeOfList-1); 
      }
      return poppedItem;
   }
   public boolean isEmpty() {
      if(listOfInts.size() == 0)
         return true;
         return false;
   }     
   public int peek() {
      int stackTop = 0;   
      if(!isEmpty()) {
         int sizeOfList = listOfInts.size();
         stackTop = listOfInts.get(sizeOfList-1);
      }
      return stackTop;
   }
   public String toString() {
      String str = "[";
      for(int i = 0; i < listOfInts.size(); i++) {
         str = str +listOfInts.get(i);
         if(i!=listOfInts.size()-1)
            str = str +", ";             
         }
      str = str +"]";
      return str;
   }
}