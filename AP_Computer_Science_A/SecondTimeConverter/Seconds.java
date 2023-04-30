
/*Users/ethanmikel/Desktop/AP CSA Plus/AP CSA/SecondTimeConverter/Seconds.java
 * This program is designed to convert an amount of seconds into hours, minutes, and seconds.
 *
 * Ethan Mikel
 * 8/26/19
 */
import java.util.Scanner;

public class Seconds
{
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        
        System.out.print("\n");
        System.out.print
        ("Enter Number of Seconds: ");
        
        int seconds = i.nextInt();

        
        int seconds2 = seconds % 60; 
        int hours = seconds / 60; 
        int minutes = hours % 60;
        
        hours = hours / 60; 
        
        System.out.print(hours + "Hr. ");
        System.out.print(minutes + "Min. ");
        System.out.print(seconds2 + "Sec.");
        System.out.print("\n");
           
    }
}
    
        
        