//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.lang.System.*;
import java.util.*;

// UniquesDupes class
public class UniquesDupes
{
   // getUniques method
   public static Set<String> getUniques(String input)
   {
      Set<String> uniques = new TreeSet<String>();
      
      // spliting the input String using split method of String class with delimiter as empty space(" ")
      // and storing the returned array of strings in array words
      String[] words = input.split(" ");
      // creating a set of words by converting the String[] to List type and assigning to uniques
      // by default set class removes duplicates
      uniques = new TreeSet<String>(Arrays.asList(words));
      // returning uniques
      return uniques;
      }
   public static Set<String> getDupes(String input)
   {
      // spliting the input into words and assigning to words array
      String[] words = input.split(" ");
      // making a copy of unique words form words
      Set<String> uniques = new TreeSet<String>(Arrays.asList(words));
      
      // creating an empty Set Object for storing the duplicates strings
      Set<String> dupes = new TreeSet<String>();
      
      // variable for counting the occurence of each string
      int count = 0;
      
      // iterating over each string in uniques
      for(String str1: uniques){
      // for each string intializing count to 0
      count = 0;
      // iterating over each word in words
      for(String str2: words){
      // comparing the str1(word in unique) and str2(word in words)
      if (str1.equals(str2)){
      // if both are equal, incrementing count value by 1
      count += 1;
   }
   }
   // if the count value is greater than 1 (occuring a word more than one time in words)
   if (count > 1){
   // adding it to the Set dupes
      dupes.add(str1);
    }
   }
   // returning dupes
   return dupes;
   }
}