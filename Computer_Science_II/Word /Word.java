//(c) A+ Computer Science
//www.apluscompsci.com
//Name
/**
* @param args the command line arguments
*/

import java.lang.*;

public class Word{

private String word;

   public Word() 
   {}
   
   public Word(String s){
      this.word = s;
   }
   
   void setString(String s) {
      this.word=s;
   }
   
   public char getFirstChar(){
      return word.charAt(0);
   }
   
   public char getLasrChar(){
     return word.charAt(word.length()-1);
   }
   public String getBackWards() {
      StringBuilder reverseWord = new StringBuilder();
      reverseWord.append(word);
      return reverseWord.reverse().toString();
   }

   public String toString() {
      return word;
   }
 }