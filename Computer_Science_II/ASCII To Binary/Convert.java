//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Convert {

   private String sentence;
   private String binary;
   
   public Convert() {
      sentence = "";
      binary = "";
      convert();
   }
   public Convert(String sentence) {
      this.sentence = sentence;
      this.binary = "";
      convert();
   }
   public void convert() {
      for(int i = 0; i < this.sentence.length(); i++) {
         binary += getBinaryOfNumber((int)sentence.charAt(i)) + " ";
      }
   }
   public String toString() {
      return "";
   }
   public String getSentence() {
       return sentence;
   }
   public void setSentence(String sentence) {
       this.sentence = sentence;
   }
   public String getBinary() {
       return binary;
   }
   public void setBinary(String binary) {
       this.binary = binary;
   }
   public static String getBinaryOfNumber(int num) {
       String s = "";
       int remainder;
       while(num > 0) {
           remainder = num % 2;
           num = num / 2;
           s = Integer.toString(remainder) + s;
       }
       s = String.format("%" + 8 + "s",s).replace(' ', '0');
       return s;
   }
  
}