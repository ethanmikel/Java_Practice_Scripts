//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AcroRunner {

   public static void main(String[] args) throws IOException {

       Map<String,String> acronymTable = new HashMap<>();
       
       acronymTable.put("TSO", "Texas State Optical");
       acronymTable.put("PDA", "Personal Display of Affection");
       acronymTable.put("RBI", "Runs Batted In");
       acronymTable.put("SO", "Strike Out");
       acronymTable.put("FG", "Field Goal");
       acronymTable.put("CPU", "Central Processing Unit");
       acronymTable.put("HD", "Hard Drive");
       acronymTable.put("PU", "Pick Up");
      
       Acronyms acronyms = new Acronyms(acronymTable);

       acronyms.printAcronyms();
       System.out.println("\n");       
         
       System.out.println("==== READ LINES =====\n");      
       convert(acronymTable,"src/input.txt");

   }
  
  
   public static void convert(Map<String,String> acronymTable,String fileName) throws IOException{

       FileReader reader = new FileReader("acronyms.txt");
       BufferedReader br = new BufferedReader(reader);

       String line = br.readLine();
      
       while(line!=null){
           String[] s = line.split(" ");
           for(String x:s){
               if(acronymTable.containsKey(x))
                   System.out.print(acronymTable.get(x)+" ");
               else
           System.out.print(x+" ");
           }
           System.out.println();
           line = br.readLine();
       }
      
      
   }
  
  

}