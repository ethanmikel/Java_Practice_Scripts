//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner {
    public static void main(String[] args) {

        String filename = "words.dat";

        try {
            // make a new table
            HashTable table = new HashTable();

            // read from the file
            Scanner fileScanner = new Scanner(new File(filename));

            int values = Integer.parseInt(fileScanner.nextLine());

            for (int i = 0; fileScanner.hasNextLine() && i < values; ++i) {
                table.add(new Word(fileScanner.nextLine()));
            }

            // print out the table
            System.out.println(table);

     
        } catch (Exception e) {
            System.out.println("Houston, we have a problem!");
            e.printStackTrace();
        }
    }
}