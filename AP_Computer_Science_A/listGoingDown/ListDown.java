//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

class ListDown{
   public static boolean go(List<Integer>list){
       for(int i = 0; i <  list.size() -1; i++){
           if (list.get(i) < list.get(i + 1))
               return false;
            }      
       return true;
   }
}