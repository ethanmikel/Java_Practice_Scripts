//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;
import java.util.Scanner;


public class IteratorReplacerRunner {
   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter list of words : ");
      String inputString = scanner.nextLine();

      System.out.print("Enter word to replace : ");
      String wordToReplace = scanner.nextLine();
        
      System.out.print("Enter word with which to replace the original word : "); 
      String wordToReplaceWith = scanner.nextLine();
        
      IteratorReplacer itep = new IteratorReplacer(inputString, wordToReplace, wordToReplaceWith);
      System.out.println( "Input list of word before replace : " + itep.toString());
      itep.replace();
        
      System.out.println( "Input list of word after replace : " + itep.toString());
      scanner.close();
   }
}