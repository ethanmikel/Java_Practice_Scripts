//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class Monster
{
	private String myName = "long way to go for a toString()";

	public Monster()
	{
		myName = "Monster";    //uncomment and recompile and run
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString( )
	{
		return myName;
	}
}

class Witch extends Monster
{
   public Witch()	//GoodWitch will not compile without this constructor
   { 
   	super(); //automatically calls super()
   }  
   
   public Witch(String name)
   { 
   	super(name);
   }  
   
}

class GoodWitch extends Witch
{
   //what do we need here??
   //EM We need to have a blank public GoodWitch method, because this allows you to be able to 
   //asscess GoodWitch in other classes like WhatsOnTheInside.
   
   public GoodWitch()
   {
 	  super(); 
   }
   
   public GoodWitch( String name )
   {
 	  super(name); 
   }
}

   
public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch bad = new GoodWitch("Sandwich");   //why does this not compile
		out.println(bad);                            //EM it does not complie, because the GoodWitch does not have a 
		                                             //reference  to the starter output of Monster. To fix this you 
                                                   //need to add the blank GoodWitch.                          
		GoodWitch witch = new GoodWitch("Harriet");
		out.println(witch);
	}
}