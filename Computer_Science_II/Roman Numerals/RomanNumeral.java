//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

   public RomanNumeral(String str)
   {
     roman=str;
   }

   public RomanNumeral(Integer orig)
   {
     number=orig;
     roman="";
     for(int i=0;i<NUMBERS.length;i++) {
        while(number >= NUMBERS[i]) {
            number -= NUMBERS[i];
            roman+=LETTERS[i];
         }
     }
 }

   public void setNumber(Integer num){
      roman="";
      number=num;
       for(int i=0;i<NUMBERS.length;i++) {
          while(number >= NUMBERS[i]) {
             number -= NUMBERS[i];
             roman+=LETTERS[i];
          }
      }
 }

   public void setRoman(String rom) {
      int decimal = 0;
      roman=rom;
      for(int x = 0;x<roman.length();x++) {
         char convertToDecimal = roman.charAt(x);
         switch (convertToDecimal){
            case 'M':
            decimal += 1000;
            break;

            case 'D':
               decimal += 500;
               break;

            case 'C':
               decimal += 100;
               break;

            case 'L':
               decimal += 50;
               break;

            case 'X':
               decimal += 10;
               break;

            case 'V':
                decimal += 5;
                break;

            case 'I':
                 decimal += 1;
                 break;
            }
         }
         if (roman.contains("IV")){
           decimal-=2;
         }
         if (roman.contains("IX")) {
           decimal-=2;
         }
         if (roman.contains("XL")) {
           decimal-=10;
          }
         if (roman.contains("XC")) {
           decimal-=10;
         }
         if (roman.contains("CD")) {
           decimal-=100;
         }
         if (roman.contains("CM")) {
           decimal-=100;
         }
          
         number= decimal;
      
   }
   public Integer getNumber() {
      return number;
   }
   public String toString() {
      return roman + "\n";
   }
}