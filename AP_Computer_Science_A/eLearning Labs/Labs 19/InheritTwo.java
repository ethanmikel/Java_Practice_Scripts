//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		myName = "Monster";
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}

class Witch extends Monster
{	
	//how does Witch work if it has no code?
   //EM It works, because the Monster extends its code to Witch
}

//make a new type of Monster - Sasquatch 
class Sasquatch extends Witch
{
}


public class InheritTwo
{
  public static void main ( String[] args )
  {
     Monster m = new Monster();
     out.println(m);

     Witch witch = new Witch();
     out.println(witch);
     
     Sasquatch sasq = new Sasquatch();
     out.println(sasq);
     //instantiate Sasquatch
     
     
  }
}