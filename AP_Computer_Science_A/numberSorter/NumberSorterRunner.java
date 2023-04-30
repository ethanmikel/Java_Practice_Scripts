//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class NumberSorterRunner
{
    public static void main(String[] args) {
        int[] array = {10,30,20,40,50,15};
        int find = 12;
        System.out.println("The net largest value after " + find + " is " + NumberSorter.getNextLargest(array, find) + "\n");
        
    }
}