//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;

public class PrimesRunner
{
   public static void main(String[] args) throws IOException
   {
       BufferedReader reader;
       {
           reader = new BufferedReader(new FileReader("numbers.txt"));
           String numberinstring=reader.readLine();
           while(numberinstring!=null){
               int number=Integer.parseInt(numberinstring);
               Prime obj=new Prime(number);
               if(obj.isPrime()){
                   System.out.println(number + " is PRIME");
               }
               else{
                   System.out.println(number + " is NOT PRIME");
               }
               numberinstring=reader.readLine();
           }
           reader.close();
   }
  }
 }