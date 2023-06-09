//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;
   private String line;

    public void setLine(String ln)
    {
       line=ln;
    }
    public double getAmount()
    {
       Scanner chopper = new Scanner(line);
       double cups = 0;
       while(chopper.hasNextInt()) {
       {
           int weight=chopper.nextInt();
           if(weight>=2 && weight<=4)
               cups+=.5*7;
           else if(weight >= 5 && weight<=7)
               cups+=1*7;
           else if(weight >= 8 && weight<=9)
               cups+=1.5*7;
           else if(weight>=10 && weight<=19)
               cups+=2*7;
           else if(weight>=20 && weight<=39)
               cups+=3.5*7;
           else if(weight>=40 && weight<=59)
               cups+=4.5*7;
           else if(weight>=60 && weight<=79)
               cups+=6*7;
           else if(weight>=80)
               cups+=7.5*7;
       }
      }
        return Math.ceil(cups/60.0);
    }
   public String toString()
   {
       return getAmount() + " ";
   }
}