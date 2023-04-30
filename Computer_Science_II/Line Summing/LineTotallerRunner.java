//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class LineTotallerRunner {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        LineTotaller lineTotaller = new LineTotaller();

        lineTotaller.setLine("1 2 3 4 5 6");
        System.out.println(lineTotaller.getLine());
        System.out.println("sum = " + lineTotaller.getSum() + "\n");

        lineTotaller.setLine("10 20 30 40 50 60");
        System.out.println(lineTotaller.getLine());
        System.out.println("sum = " + lineTotaller.getSum() + "\n");

        lineTotaller.setLine("250 657 2154 345 6796");
        System.out.println(lineTotaller.getLine());
        System.out.println("sum = " + lineTotaller.getSum() + "\n");

        lineTotaller.setLine("0");
        System.out.println(lineTotaller.getLine());
        System.out.println("sum = " + lineTotaller.getSum() + "\n");

        lineTotaller.setLine("-99 45 -98 92 87");
        System.out.println(lineTotaller.getLine());
        System.out.println("sum = " + lineTotaller.getSum() + "\n");
    }

}
