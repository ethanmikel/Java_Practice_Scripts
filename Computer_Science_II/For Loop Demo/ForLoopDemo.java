//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class ForLoopDemo {

   public static void runForLoop(int start, int stop, int increment ){
   
      System.out.println("start "+start+" : stop "+stop+" : increment "+increment);
      for(int t=start;t<=stop;t=t+increment)
         System.out.print(t+" ");
         System.out.print("\n\n");
   }
}