//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster {
   int ht,wt,age;
   Monster(int ht, int wt, int age){
       this.ht = ht;
       this.wt = wt;
       this.age = age;
   }  
   boolean isSmaller(Monster mon){
       if(this.ht<mon.ht){
           return true;
       }
       else{
           return false;
       }
   }
   boolean isBigger(Monster mon){
       if(this.ht>mon.ht){
           return true;
       }
       else{
           return false;
       }
   }
   public String toString() {
      
       return ""+ht+" "+wt+" "+age;
   }
}