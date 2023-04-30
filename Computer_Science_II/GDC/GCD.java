//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class GCD {
   public static long getGCD( int numOne, int numTwo ){
   long gcd=0;
   if(numOne>numTwo){
      if(numTwo==0){
         return gcd;
      }
      else {
         return getGCD(numOne%numTwo,numTwo);
      }
   }
   else {
      if(numOne==0){
         gcd=numTwo;
         return gcd;
      }
      else {
         return getGCD(numTwo%numOne,numOne);
      }
    }
  }
}