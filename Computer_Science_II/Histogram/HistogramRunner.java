//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner
{
    public static void main( String args[] ) throws IOException
    {

        Scanner in = new Scanner(new File("Histogram.dat"));

            while (in.hasNextLine())
            {
                String n = in.nextLine();
                Histogram a = new Histogram(n);
                System.out.println (a);
            }

    }
}