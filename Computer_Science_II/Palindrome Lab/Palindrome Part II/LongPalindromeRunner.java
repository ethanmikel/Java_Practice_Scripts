//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class LongPalindromeRunner {
   public static void main(String args[]) {
      String data[] = new String[] { "bobcat", "bobracecarcat", "alligatorslikegroovycatslikemadamandrooroo", "idrovetothelibraryinmyracecartolearnaboutpanama" };
      for (int i = 0; i < data.length; i++) {
         ArrayList<Palin> allPalins = LongPalindrome.getAllPalins(data[i]);
         Palin longest = LongPalindrome.getLongestPalin(data[i]);
         System.out.println(allPalins);
         System.out.println(longest);
         System.out.println();
      }
   }
}