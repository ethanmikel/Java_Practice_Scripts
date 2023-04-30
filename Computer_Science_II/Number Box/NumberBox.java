//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class NumberBox {

	public static void print( int num ) {
	   for(int i = 1; i <= num; i++) {
      System.out.println("##" + i + "##" + "---##" + ((num - i) + 1) + "##---##" + i + "##");
     } 
   }
}