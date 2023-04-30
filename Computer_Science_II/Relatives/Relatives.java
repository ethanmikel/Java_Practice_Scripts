//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives {
   private Map<String,Set<String>> map;

   public Relatives() {
      map = new TreeMap<String,Set<String>>();
   }

   public void setPersonRelative(String line) {
      String[] personRelative = line.split(" ");
      String person = personRelative[0];
      String relative = personRelative[1];

      if(map.containsKey(person)) {
         map.get(person).add(relative);
      }
      else {
         Set<String> relatives = new TreeSet<String>();
         relatives.add(relative);
         map.put(person,relatives);
      }
   }
   public String getRelatives(String person) {
      String s = "";
      s+=(person);
      s+=(" is related to ");
      for(String relative : map.get(person)) {
         s+=(relative);
         s+=(' ');
      }
      return s;
   }
   public void calculate(){
      for(String i:map.keySet()) {
         System.out.println(getRelatives(i));
      }
  
   }
   public String toString() {
      String output="";
      return output;
   }
}