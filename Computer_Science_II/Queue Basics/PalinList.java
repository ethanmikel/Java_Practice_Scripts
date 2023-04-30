//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class PalinList {

   private Queue<String> queue;
   private Stack<String> stack;

   public PalinList()
   {
       queue = new LinkedList<String>();
       stack = new Stack<String>();
   }

   public PalinList(String list)
   {
       this();
       setList(list);
   }

   public void setList(String list)
   {
       String[] arr = list.split(" ");
       List<String> strList = Arrays.asList(arr);
       queue.addAll(strList);
       stack.addAll(strList);
   }

   public boolean isPalin()
   {
       boolean isPalindrome = true;
       Queue<String> tempQueue = new LinkedList<String>();
       tempQueue.addAll(queue);
       Stack<String> tempStack = new Stack<String>();
       tempStack.addAll(stack);
       
       while (!tempQueue.isEmpty()) {
          if(tempQueue.remove().equals(tempStack.pop())) {
             continue;
          } else {
             isPalindrome = false;
             break;
          }
       }

       return isPalindrome;
   }

   public String toString() {
       if(isPalin()) {
          return queue.toString()+" is a Palinlist";
       } else {
          return queue.toString()+" is not a Palinlist";
       }

   }
}