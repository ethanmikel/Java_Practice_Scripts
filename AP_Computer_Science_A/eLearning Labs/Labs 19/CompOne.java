//(c) A+ Computer Science
// www.apluscompsci.com

//composition example 1

//Monster is not a String, but it has a String 
class Monster
{
  private String myName;

  public Monster( String name ) {
      myName = name;
  }
  public String toString() {
     return myName + "\n";
  }
}

public class CompOne
{
	public static void main ( String[] args )
	{
		Monster one = new Monster("hello");
		Monster two = new Monster("high");
		System.out.println( one );
		System.out.println( two );			
	}
}