//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Prime  
{
   public static boolean isPrime(int num){
   boolean f=true;      
      for(int i=2;i<num/2+1;i++) {
           if(num%i==0)       
              f=false;
            }
      return f;  
   }
}