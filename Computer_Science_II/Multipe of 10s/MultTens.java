//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class MultTens {

   public static String go(int x ){
      if(x<=0){
      return "aplus";
      }
      String result="";
      int num=10;
      for(int i=0;i<x;i++){
         result=result+num;
         num=num+10;
      }
      return result;
   }
}

