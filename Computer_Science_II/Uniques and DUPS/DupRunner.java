//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
public static void main( String args[] )
{
// creating Scanner Object for taking user input
Scanner scan = new Scanner(System.in);

System.out.print("Original List : ");
// taking user input using nextLine() method of Scanner class and assigning it to input variable string;
String input = scan.nextLine();
// calling the getUniques method of UniquesDupes class and printing the returned Set
System.out.println("Uniques : " + UniquesDupes.getUniques(input));
// calling the getDupes method of UniquesDupes class and printing the returned Set
System.out.println("Dupes : " + UniquesDupes.getDupes(input));
}
}