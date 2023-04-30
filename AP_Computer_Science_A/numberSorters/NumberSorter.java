//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	public static int getNextLargest(int[] numArray, int searchNum) {
        int value = searchNum;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > searchNum) {
                if (value == searchNum) {
                    value = numArray[i];
                }
            }
        }
        if (value == searchNum) {
            return -1;
        } else {
            return value;
        }
    }
}