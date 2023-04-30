//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Number implements Comparable<Number> {

   private String number;
   private String base;

   public Number(String number, String base) {
      super();
      this.number = number;
      this.base = base;
   }
   
   public String getNumber() {
      return number;
   }
   
   public void setNumber(String number) {
      this.number = number;
   }

   public String getBase() {
      return base;
   }

   public void setBase(String base) {
      this.base = base;
   }

   public int countBinaryOnes() {
      String temp = getBinaryValue(); 
      int count = 0;
      for (int i = 0; i < temp.length(); i++) {
         if (temp.charAt(i) == '1') {
            count++;
         }
      }
      return count;
   }

   public String getBinaryValue() {
      return Integer.toString(Integer.parseInt(number, Integer.parseInt(base)), 2);
   }

   public int getDecimalValue() {
      return Integer.parseInt(number, Integer.parseInt(base));
   }

   public int compareTo(Number param) {
      if (countBinaryOnes() > param.countBinaryOnes()) {
         return 1; 
      } 
      else if (countBinaryOnes() == param.countBinaryOnes()) {
         if (getDecimalValue() > param.getDecimalValue())
            return 1;
         else if (getDecimalValue() == param.getDecimalValue()) {
            return number.compareTo(param.getNumber()); 
         } 
         else
            return -1;
      } 
      else {
         return -1;
      }
   }
}