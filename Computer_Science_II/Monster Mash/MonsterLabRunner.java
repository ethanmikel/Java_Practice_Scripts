//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("How many monsters are there in herd? ");
       int size = Integer.parseInt(sc.nextLine());
       Monsters herd = new Monsters(size);
      
       for(int i=0; i<size; i++){
           System.out.print("Enter the ht: ");
           int ht = Integer.parseInt(sc.nextLine());
           System.out.print("Enter the wt: ");
           int wt = Integer.parseInt(sc.nextLine());
           System.out.print("Enter the age: ");
           int age = Integer.parseInt(sc.nextLine());
           Monster mon = new Monster(ht,wt,age);
           herd.add(mon,i);
           System.out.println("\n");
       }
       System.out.println("Herd :: "+herd);
       Monster smallest = herd.get(0);
       Monster largest = herd.get(0);
       for(int i=1; i<size; i++){
           if(herd.get(i).ht<smallest.ht){
               if(herd.size==1){
                   smallest = herd.get(0);
                   largest = herd.get(0);
               }
               smallest = herd.get(i);
           }
           if(herd.get(i).ht>largest.ht){
               largest = herd.get(i);
           }
       }
      
       System.out.println("Smallest :: "+smallest);
       System.out.println("Largest :: "+largest);
      
       sc.close();
   }
}

