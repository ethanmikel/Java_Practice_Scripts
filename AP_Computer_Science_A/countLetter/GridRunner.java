//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
   public static void main(String args[])
   {
       String[] vals = {"a", "b", "c", "x","2", "7", "9"};
       Grid g = new Grid(20, 20, vals);
       String str = g.findMax(vals);
       System.out.println("\n\n " + str + g);
       
       System.out.println();
       
       String[] vals2 = {"a", "b", "c", "x","2", "7", "9"};
       Grid g2 = new Grid(10, 10, vals2);
       String str2 = g2.findMax(vals2);
       System.out.println("\n\n " + str2 + g2);
    }
}