//(c) A+ Computer Science
//www.apluscompsci.com
//Name
import java.io.File;
import java.util.Scanner;

public class PrimeRunner {

   public static void main(String args[]) {
   
       Scanner sc=new Scanner(System.in); 
       Prime obj=new Prime();      
       System.out.print("Enter the number: ");
       int n=sc.nextInt();           
       if(obj.isPrime(n)==true)    
           System.out.println(n+" is prime");
       else
           System.out.println(n+" is not prime");;
   }
}
