//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class LongPalindrome {
   public static ArrayList<Palin> getAllPalins(String word) {
      ArrayList<Palin> list = new ArrayList<Palin>();
      for (int i = 0; i < word.length(); i++) {
         for (int j = word.length() - 1; j >= i; j--) {
            String w = word.substring(i, j + 1);
            if (Palin.isPalin(w) && w.length() >= 2) {
               Palin p = new Palin(w);
               int index = insertLocation(list, p);
               list.add(index, p);
            }
          }
       }
   return list;
   }
   
   private static int insertLocation(ArrayList<Palin> list, Palin pal) {
   if (list.isEmpty()) {
      return 0;
   }
   if (list.get(0).getWord().compareTo(pal.getWord()) > 0) {
      return 0;
   }
   for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i).getWord().compareTo(pal.getWord()) <= 0 && list.get(i + 1).getWord().compareTo(pal.getWord()) >= 0) {
         return i + 1;
      }
   }
   return list.size();
   }
   public static Palin getLongestPalin(String word) {
   ArrayList<Palin> allPalin = getAllPalins(word);
   Palin longest = null; 
   for (Palin p : allPalin) {
      if (longest == null || p.getLength() > longest.getLength()) {
         longest = p;
      }
   }
   return longest;
   }
}