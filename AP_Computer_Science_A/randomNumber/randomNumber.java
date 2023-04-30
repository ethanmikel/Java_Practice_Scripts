/**
 *
 *
 * @author (Ethan Mike;)
 * @version (10/21/19)
 */
import java.util.Scanner;

class randomNumber {
   public static void main(String[] args) {       
     
     int count = 0;
     int numberGuesses = 0;
     Scanner scan = new Scanner(System.in);
    
     // Choose a random number from 0-100  
     int randomNumber = (int)(Math.random()*101);  
    
     // Get the first guess
     int guess;
     System.out.println("Guess a number between 1-100");
     guess = scan.nextInt();
     numberGuesses++;
      // Loop while the guess does not equal the random number,
     while (guess != randomNumber){
       // If the guess is less than the random number, print out "Too low!"
       // Get a new guess (save it into the same variable)
        if (guess < randomNumber){
           System.out.println("Too low!");
           guess = scan.nextInt();
           numberGuesses++;
       }
        // If the guess is greater than the random number, print out "Too high!"
        else if (guess > randomNumber){ 
           System.out.println("Too high!");
           guess = scan.nextInt();
           numberGuesses++;
        }
        // Print out something like "You got it
     }
     // Print out something like "You got it
     if (guess == randomNumber) {
        System.out.println("You got it! It only took " + numberGuesses + " guesses and the number was " + randomNumber + ".");
       }
  }
}
