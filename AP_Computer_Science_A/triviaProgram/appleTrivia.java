
import java.util.Scanner;

public class appleTrivia 
{
  public static void main(String[] args) 
  {
    System.out.println("\nLet's play a trivia game. I will try and guess the Apple product that you are thinking of! The first letter is yes and the second letter is no!");
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Is it a newer Apple product (a or b)?");
    String answer = scan.nextLine();
    
    if (answer.equals("n")) {
            System.out.println("Was it made when Steve Jobs was there or at the of him being CEO (m or a)?");
            answer = scan.nextLine();
    }
    else if (answer.equals("y")) {
            System.out.println("Does it have a touch screen (c or d)?");
            answer = scan.nextLine();
    }
    if (answer.equals("c")) {
            System.out.println("Does it have a medium or bigger sized screen (e or f)?");
            answer = scan.nextLine();
    }
    if (answer.equals("e")) {
            System.out.println("Is it able to make phone calls (g or h)?");
            answer = scan.nextLine();
    }
    if (answer.equals("g")) {
            System.out.println("Than it's an iPhone");
    }
    if (answer.equals("h")) {
            System.out.println("Does it have a big screen and some models support a keyboard (i or j)?");
            answer = scan.nextLine();
    }
    if (answer.equals("i")) {
            System.out.println("Than it's some model of the iPads!");
    }
    if (answer.equals("j")) {
            System.out.println("Than it's some model of the iPod Touch?");
    }
    if (answer.equals("f")) {
            System.out.println("Than it's an Apple Watch!");
    }
    if (answer.equals("d")) {
            System.out.println("Is it a Mac (k or l)?");
            answer = scan.nextLine();
    }
    if (answer.equals("k")) {
            System.out.println("Than it is either a iMac or a MacBook!");
    }
    if (answer.equals("l")) {
            System.out.println("Than it's some other type of Apple product like AirPods!");
    }
    if (answer.equals("m")) {
            System.out.println("Then it is one of the greatest and never forgotten Apple products!");
    }
 }
}