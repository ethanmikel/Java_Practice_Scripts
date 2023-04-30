//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable {

    private LinkedList<Word>[] table;

    public HashTable() {

        table = new LinkedList[10];
    }

    public void add(Word obj) {
        // System.out.println("add");

        // making hashcode in range of array indexes
        int index = obj.hashCode() % table.length;

        // We allocate an object of LinkedList
        // only when there exists at least one element
        // to reside at that index, saves memory
        if (table[index] == null) {
            table[index] = new LinkedList<>();
            table[index].add(obj);
            return;
        }

        // if this entry doesn't exist
        if (!table[index].contains(obj))
            table[index].add(obj);
    }

    public String toString() {
        StringBuilder output = new StringBuilder("HASHTABLE\n");

        for (int i = 0; i < table.length; ++i) {
            output.append("bucket ").append(i);

            if (table[i] == null) {
                output.append("\n");
                continue;
            }

            for (Word entry : table[i]) {
                output.append(" ").append(entry.getValue());
            }
            output.append("\n");
        }

        return output.toString();
    }
}