//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.Math;

public class Prime{
   private int number;

   public Prime(int number){
       this.number=number;
   }

   public boolean isPrime(){
       int count=0;
       for(int i=1;i<=this.number;i++){
           if(this.number%i==0){
               count+=1;
           }
           if(count>2){
               return false;
           }
       }
       if(count==2){
           return true;
       }
       else{
           return false;
       }
   }

   public String toString()
   {
       return this.number+" ";
   }
}