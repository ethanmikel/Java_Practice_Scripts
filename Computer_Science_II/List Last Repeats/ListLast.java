//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

class ListLast{
   public static boolean go(List<Integer>list){
     int value=list.get(list.size()-1);     
     for(int i=0;i<list.size()-1;i++) {
       if(list.get(i)==value) {
          return true;
       }
     }
    return false;
   }
}