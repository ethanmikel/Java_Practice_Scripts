//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] mat = {{1,2,3},{5,5,5,5}};
		System.out.println( "The biggest number is :: " + Biggest.getBig( mat ) );
		
		int[][] mat1 = {{1,2,3},{-5},{11},{21,2}};
		System.out.println( "The biggest number is :: " + Biggest.getBig( mat1 ) );
		
		int[][] mat2 = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println( "The biggest number is :: " + Biggest.getBig( mat2 ) );
		
		int[][] mat3 = {{-20, -40},{-234,-234234 } };
		System.out.println( "The biggest number is :: " + Biggest.getBig( mat3 ) );
	}
}



