//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Histogram
{
   private int [] amt = new int[10];
   public String go(int[] ray)
   {
   
   
       for (int i = 0; i < ray.length; i++) {
      
        switch (ray[i]) {
        case 0 : amt[0]++; break;
        case 1 : amt[1]++; break;
        case 2 : amt[2]++; break;
        case 3 : amt[3]++; break;
        case 4 : amt[4]++; break;
        case 5 : amt[5]++; break;
        case 6 : amt[6]++; break;
        case 7 : amt[7]++; break;
        case 8 : amt[8]++; break;
        case 9 : amt[9]++; break;
        }
        
        }
        return toString();
        
        }
        
       public String toString() {
        
        return "0 - " + amt[0]+ "\n" + "1 - " + amt[1] + "\n"  + "2 - " + amt[2] +  "\n"  + "3 - " + amt[3] + "\n"  + "4 - " + amt[4]+ "\n" + "5 - " + amt[5]+ "\n" + "6 - " + amt[6]+ "\n" + "7 - " + amt[7] + "\n" + "8 - " + amt[8]+ "\n" + "9 - " + amt[9]+ "\n";
      }
        
        
        
        
        }
            
                    