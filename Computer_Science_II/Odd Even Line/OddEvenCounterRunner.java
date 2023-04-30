//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class OddEvenCounterRunner {

public static void main(String[] args) {
        OddEvenCounter oddEvenCounter = new OddEvenCounter();

        oddEvenCounter.setLine("9 10 5 20");
        System.out.println(oddEvenCounter.getLine());
        System.out.println("even count = " + oddEvenCounter.getEvenCount());
        System.out.println("odd count = " + oddEvenCounter.getOddCount() + "\n\n");

        oddEvenCounter.setLine("11 22 33 44 55 66 77");
        System.out.println(oddEvenCounter.getLine());
        System.out.println("even count = " + oddEvenCounter.getEvenCount());
        System.out.println("odd count = " + oddEvenCounter.getOddCount() + "\n\n");

        oddEvenCounter.setLine("3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6");
        System.out.println(oddEvenCounter.getLine());
        System.out.println("even count = " + oddEvenCounter.getEvenCount());
        System.out.println("odd count = " + oddEvenCounter.getOddCount() + "\n\n");

        oddEvenCounter.setLine("2 4 6 8 2 4 6");
        System.out.println(oddEvenCounter.getLine());
        System.out.println("even count = " + oddEvenCounter.getEvenCount());
        System.out.println("odd count = " + oddEvenCounter.getOddCount() + "\n\n");

        oddEvenCounter.setLine("1 3 5 7 9 1 3 5");
        System.out.println(oddEvenCounter.getLine());
        System.out.println("even count = " + oddEvenCounter.getEvenCount());
        System.out.println("odd count = " + oddEvenCounter.getOddCount() + "\n\n");
    
    }

}