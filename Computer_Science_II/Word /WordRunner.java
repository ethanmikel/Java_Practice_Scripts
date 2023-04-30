//(c) A+ Computer Science
//www.apluscompsci.com
//Name
/**
* @param args the command line arguments
*/

import static java.lang.System.*;

public class WordRunner {

   public static void main(String[] args) {

   Word w1=new Word("Hello");
   System.out.println(w1.getFirstChar());
   System.out.println(w1.getLasrChar());
   System.out.println(w1.getBackWards());
   System.out.println(w1);
   System.out.println("\n");

   Word w2=new Word("Word");
   System.out.println(w2.getFirstChar());
   System.out.println(w2.getLasrChar());
   System.out.println(w2.getBackWards());
   System.out.println(w2);
   System.out.println("\n");

   Word w3=new Word("JukeBox");
   System.out.println(w3.getFirstChar());
   System.out.println(w3.getLasrChar());
   System.out.println(w3.getBackWards());
   System.out.println(w3);
   System.out.println("\n");

   Word w4=new Word("TCEA");
   System.out.println(w4.getFirstChar());
   System.out.println(w4.getLasrChar());
   System.out.println(w4.getBackWards());
   System.out.println(w4);
   System.out.println("\n");

   Word w5=new Word("UIL");
   System.out.println(w5.getFirstChar());
   System.out.println(w5.getLasrChar());
   System.out.println(w5.getBackWards());
   System.out.println(w5);
   System.out.println("\n");   
  } 
}