//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.ArrayList;
import java.lang.String;

public class WordRunner
{
    public static void main(String[] args)
    {
        Word one = new Word("chicken");
        out.println(one);
        out.println("num vowels == " + one.getNumVowels());
        out.println("num chars == " + one.getLength());
        
        Word two = new Word("alligator");
        out.println("\n\n"+ two);
        out.println("num vowels == " + two.getNumVowels());
        out.println("num chars == " + two.getLength());
        
        Word three = new Word("elephant");
        out.println("\n\n"+ three);
        out.println("num vowels == " + three.getNumVowels());
        out.println("num chars == " + three.getLength());
    }
}