//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets {
   private Set<Integer> odds;
   private Set<Integer> evens;

   public OddEvenSets() {
   odds = new TreeSet<Integer>();
   evens = new TreeSet<Integer>();
   }

   public OddEvenSets(String line) {
   odds = new TreeSet<Integer>();
   evens = new TreeSet<Integer>();
   String []data=line.split(" ");
   for(String n:data) {
       int num = Integer.parseInt(n);
       if(num%2 == 0) {
           evens.add(num);
       }
       else {
           odds.add(num);
       }
   }
}

public String toString()
{
return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
}
}