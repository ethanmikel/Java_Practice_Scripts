//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ConvertRunner {
   public static void main(String args[]) throws IOException {
      Scanner file = new Scanner(new File("convert.dat"));
      while(file.hasNextLine()) { 
         String line = file.nextLine(); 
         Convert c = new Convert(line); 
         String binaryLine = c.getBinary(); 
         System.out.print(line+"\n"+binaryLine+"\n\n");
       }
   }
}