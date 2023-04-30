import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class ListMostFreq {
   public static int go(List<Integer> ray) {
       int maxNumCount = 0;
       int mostFrequentNum = ray.get(0);
       int currentCount = 0;

       for (int i = 1; i < ray.size(); i++) {
           Collections.sort(ray);
           if (ray.get(i) == ray.get(i - 1))
               currentCount++;
           else {
               if (currentCount > maxNumCount) {
                   maxNumCount = currentCount;
                   mostFrequentNum = ray.get(i - 1);
               }
               currentCount = 0;
           }
       }
       if (currentCount > maxNumCount)
       {
           maxNumCount = currentCount;
           mostFrequentNum = ray.get(0);
        }
        return mostFrequentNum;
   }
}
