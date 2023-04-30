//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheLineRunner {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner file = new Scanner(new File("largestNumber.txt"));
        int n = file.nextInt();
        file.nextLine();
        for (int i = 0; i < n; i++) {
            TheLine line = new TheLine(file.nextLine());
            System.out.println(line.getLine() + " -  Largest == " + line.getLargest() + "\n\n");
        }
    }
}