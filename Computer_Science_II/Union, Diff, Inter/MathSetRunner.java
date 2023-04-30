//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner {
   public static void main(String[] args) throws IOException {
      MathSet ms = null;     
      File f = new File("mathsetdata.dat");
      Scanner sc=new Scanner(f);
      String line=null;
         while (sc.hasNext()) {
            line = sc.nextLine();
            ms = new MathSet(line);
            System.out.println(ms.toString());
            System.out.println("union - " + ms.union());
            System.out.println("intersection - " + ms.intersection());
            System.out.println("difference A-B - " + ms.differenceAMinusB());
            System.out.println("difference B-A - " + ms.differenceBMinusA());
            System.out.println("symmetric difference - " + ms.symmetricDifference());
         }
    }
}