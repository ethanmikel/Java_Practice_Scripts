//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Mikel

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker {
   private String exp;
   private Stack<Character> symbols;

   public SyntaxChecker() {
      exp="";
      symbols=new Stack<>();
   }
   public SyntaxChecker(String s) {
      exp=s;
      symbols=new Stack<>();
   }
   public void setExpression(String s) {
      exp=s;
      symbols=new Stack<>();
   }
   public boolean checkExpression() {
      int i=0;
      char c=' ';
      symbols=new Stack<>();       
      for(i=0;i<exp.length();i++){
         c=exp.charAt(i);
         switch (c) {
            case '{':
               symbols.push('}'); break;
            case '(':
               symbols.push(')'); break;
            case '<':
               symbols.push('>'); break;
            case '[':
               symbols.push(']'); break;
            case '}':
            case ')':
            case '>':
            case ']':
               if(symbols.isEmpty())
                  return false;
                  char t=symbols.pop();
                  if(t!=c)
                     return false; break;
               default: break;
           }
       }
       if(symbols.isEmpty())
         return true;
         return false;
    }
    public String toString() {
      String t="";
      if(!checkExpression())
         t=exp+" is incorrect";
      else
         t=exp+" is correct";
      return t;
    }   
}