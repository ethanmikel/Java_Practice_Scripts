//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage {
   public static double go( List<Integer> ray) {
      int max=0;
      int min=0;           
      for(int i=0;i<ray.size();i++){       
         if(max<ray.get(i)){       
            max=ray.get(i);       
         }
         if(min>ray.get(i)){   
         min=ray.get(i);       
         }
      }
      double average=(min+max)/2;       
         return average;               
   }
}