//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DownRunner
{
	public static void main( String args[] )
	{	
	ListDown ld = new ListDown();
        System.out.println(ld.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345)));
        System.out.println(ld.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
	}
}
