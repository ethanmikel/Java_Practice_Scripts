//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms {

   private Map<String,String> acronymTable;
  
   public Acronyms(Map<String,String> acronymTable){
       this.acronymTable = acronymTable;
   }
   public void printAcronyms(){
       System.out.println("=====MAP CONTENTS====\n");
       System.out.println(acronymTable);
   }

}