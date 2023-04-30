//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Monsters {
   int size;
   Monster [] herd = null;
   Monsters(int size){
       this.size = size;
       herd = new Monster[size];
   }
   public void add(Monster mon,int i) {
       herd[i]=mon;
   }
   Monster get(int ind){
       return herd[ind];
   }
   public String toString() {
       String str = "";  
       for(int i=0;i<size;i++){
           if(i+1 == size){
               str = str+herd[i].toString()+" ";
           }
           else{
               str = str+herd[i].toString()+", ";
           }
       }
       return "[ "+ str+"]";
   }
}