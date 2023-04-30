//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner{
    public static void main( String args[] ) throws IOException
    {
        File dataFile = new File("spantoeng.dat");
        SpanishToEnglish spanishToEnglish = new SpanishToEnglish();

        spanishToEnglish.initSpanishToEnglishDataFile(dataFile);
        System.out.println(spanishToEnglish);

        String toTranslate = "Aa Bb Cc Dd Ee";
        System.out.println("Translations of:"+toTranslate);
        System.out.println(spanishToEnglish.translate(toTranslate));
    }

}