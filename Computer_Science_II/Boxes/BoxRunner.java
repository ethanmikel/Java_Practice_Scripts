//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoxRunner {

   public static void main(String args[]) throws FileNotFoundException {
      Scanner file = new Scanner(new File("boxes.txt"));
      int n = file.nextInt();
      for (int i = 0; i < n; i++) {
        Box box = new Box(file.next(),file.nextInt());
        System.out.println(box);
      }
    }
}