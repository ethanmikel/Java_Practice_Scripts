//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
   public static int go(List<Integer> ray)
    {
        int totalSum = 0;
     for(int i = 0; i < ray.size(); i++) {
            if (ray.get(0) < ray.get(i)) {
            totalSum += ray.get(i);
       }
           if (ray.get(0) > totalSum || ray.isEmpty()) {
               totalSum = -1;
       }
     }
     return totalSum;
  }
}