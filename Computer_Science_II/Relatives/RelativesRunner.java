//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
   {
        Scanner in = new Scanner(new File("relatives.dat"));

         int z = in.nextInt();
         in.nextLine();
         Relatives a = new Relatives();
         for(int x = 0; x<z;x++)
         {
            String n = in.nextLine();
            a.setPersonRelative(n);
         }
         a.calculate();
    }
}