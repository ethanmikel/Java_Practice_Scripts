// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.*;

public class ToyStoreRunner {

   public static void main(String[] args) {
       ToyStore t1=new ToyStore();
       t1.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
       System.out.println("["+t1+"]");
      
       System.out.print("max == "+t1.getMostFrequentToy());
      
       String toy="sorry";
       System.out.println(toy + " " + t1.getThatToy(toy).getCount());
   }

}