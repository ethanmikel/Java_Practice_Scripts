//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;
import java.io.FileNotFoundException;


public class NumberRunner {
   public static void main(String[] args) {
   
      ArrayList<Number> numList = new ArrayList<Number>(); 
      File myObj = new File("number.dat"); 
      Scanner myReader = new Scanner(myObj);
      Number num;
      
      while (myReader.hasNextLine()) {
         String data = myReader.nextLine();
         String[] numberData = data.split(" ");
         num = new Number(numberData[0], numberData[1]);
         numList.add(num); 
                 
      Collections.sort(numList);
             
      for (Number num : numList) {
         System.out.println(num.getNumber() + " " + num.getDecimalValue()+ " " + num.getBinaryValue());
      }    
    }
  }
}