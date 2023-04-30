//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class HashTableRunner
{
        public static void main(String[] args) {
        HashTable h = new HashTable ();
        try{
            File myObj = new File("numbers.dat");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) 
                h.add (myReader.nextInt ());
            myReader.close();
            System.out.println(h);
        }
        catch(Exception e){
            System.out.println("Houston, we have a problem!");
        }
        }
}