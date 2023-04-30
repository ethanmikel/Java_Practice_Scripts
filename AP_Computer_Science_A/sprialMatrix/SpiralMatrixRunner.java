//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner {
   public static void main(String[] args)throws IOException {
       SpiralMatrix obj = new SpiralMatrix();
       Scanner sc = new Scanner(new File(""));
       while(sc.hasNext()) {
           int size = Integer.parseInt(sc.nextLine());
           obj.setSize(size);
           obj.createSpiral();
           System.out.println(obj.toString());
           System.out.println();
           System.out.println();
       }
   }
}