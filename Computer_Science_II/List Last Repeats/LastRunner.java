//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class LastRunner {

   public static void main(String[] args) {
   
   ArrayList<Integer>list= new ArrayList<Integer>();
   list.add(-99);
   list.add(1);
   list.add(2);
   list.add(3);
   list.add(4);
   list.add(5);
   list.add(6);
   list.add(7);
   list.add(8);
   list.add(9);
   list.add(10);
   list.add(5);
   System.out.println(ListLast.go(list));
   }
}