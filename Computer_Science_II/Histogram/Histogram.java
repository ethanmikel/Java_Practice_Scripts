//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
    import java.util.TreeMap;
    import java.util.Scanner;
    import static java.lang.System.*;
    import java.util.ArrayList;
    import java.util.Arrays;

public class Histogram
{
    private Map<String,Integer> histogram;    

    public Histogram(String sent)
    {

        histogram = new TreeMap<String,Integer>();

        String[] words = sent.split(" ");

        for(String c : words)
    {
        if(histogram.containsKey(c))
        {
            histogram.put(c,histogram.get(c)+1);
        }
        else
        {
            histogram.put(c,1);
        }

    }
    }

    public String toString()
    {
        String output="";

        output+="char\t1---5----01---5\n";

        String z ="";

           for(String s: histogram.keySet()) {
   StringBuilder str = new StringBuilder();
   Integer value = histogram.get(s);
   if (value!=null)
      for(int x = 0; x < value.intValue(); x++) {
         str.append("*");
      }
   output+=s+"\t"+str.toString()+"\n";
}

        return output+ "\n\n" ;
    }
}