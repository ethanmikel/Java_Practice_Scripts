//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter{
    private static int getNumDigits(int number){
     int count=0;
      while(number>0){
        count++;
        number = number/10;
     }
     return count;
}
public static int[] getSortedDigitArray(int number){
    int len = getNumDigits(number);
    int[] sorted = new int[len];
    int i=0;
    while(number>0){
        sorted[i] = number%10;
        number = number/10;
        i++;
    }
    Arrays.sort(sorted);
    return sorted;
}
}
