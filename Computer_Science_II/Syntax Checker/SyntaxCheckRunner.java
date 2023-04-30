//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Mikel

import java.util.Scanner;

public class SyntaxCheckRunner {   
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Expression : ");
       String s=sc.nextLine();
       SyntaxChecker st=new SyntaxChecker(s);
       System.out.println(st);
    }
    
}