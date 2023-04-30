//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
        private LinkedList[] table;

        public HashTable( )
        {
                table = new LinkedList[10];
                for(int i=0;i<10;i++) { table[i] = new LinkedList(); }
        }
        public void add(int value)
        {
                Number n = new Number (value);
                if (!table[n.hashCode()].contains (n))
                    table[n.hashCode()].add(n);
        }

        public String toString()
        {
                String output="HASHTABLE\n";
                for(int i=0;i<10;i++) {
                    output += "bucket " + String.valueOf(i) + " ";
                    output += table[i] + "\n";
                }

                return output;
        }
}