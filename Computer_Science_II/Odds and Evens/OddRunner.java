//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner {
   public static void main( String args[] ) throws IOException {
      OddEvenSets oddEven = null;
      File f = new File("oddevent.dat");
      Scanner sc = new Scanner(f);
      String line=null;
      while(sc.hasNext()) {
         line = sc.nextLine();
         oddEven = new OddEvenSets(line);
         System.out.println(oddEven); 
      }
  
   }
}