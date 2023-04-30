//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;


public class DogFoodRunner
{
   public static void main(String[] args)
   {
           DogFood dogFood = new DogFood();
          
           dogFood.setLine("6 10 14 18 25 32");
           System.out.println(dogFood.getAmount());
           System.out.println(dogFood.getAmount() + " - 10 POUND BAGS" + "\n");
          
           dogFood.setLine("12 15 20 26 35 42");
           System.out.println(dogFood.getAmount());
           System.out.println(dogFood.getAmount() + " - 10 POUND BAGS" + "\n");
          
           dogFood.setLine("33 38 45 51 60 65");
           System.out.println(dogFood.getAmount());
           System.out.println(dogFood.getAmount() + " - 10 POUND BAGS" + "\n");
          
           dogFood.setLine("40 50 60 77 90 101");
           System.out.println(dogFood.getAmount());
           System.out.println(dogFood.getAmount() + " - 10 POUND BAGS" + "\n");

   }
}