
/**
 *
 *
 * @author (Ethan Mikel)
 * @version (10/10/19)
 */

import java.util.Scanner;

public class truthTable
{
   public static void main(String args[])
    {
         
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("\nThis program is used to see if you can go to the beach today. Please enter all of the information needed.");
        
        Boolean sunny;
        System.out.println("Is it sunny outside? (Enter true or false)");
        sunny = scan.nextBoolean();
        
        int temp;
        System.out.println("What is the temperature outside? (Enter a whole number)");
        temp = scan.nextInt();
        
        Boolean raining;
        System.out.println("Is it not raining outside? (Enter true or false)");
        raining = scan.nextBoolean();
        
        if (sunny || (temp >80 && !raining)) {
           System.out.println("Go to the beach!");
       }
       else
           System.out.println("You cannot go to the beach!");
        }
    }
