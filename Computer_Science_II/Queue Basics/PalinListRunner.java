//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PalinListRunner {
   public static void main(String[] args) {
      PalinList palinList = new PalinList("one two three two one");
      System.out.println(palinList);
      
      PalinList palinList1 = new PalinList("1 2 3 4 5 one two three four five");
      System.out.println(palinList1);
      
      PalinList palinList2 = new PalinList("a b c d e f g h");
      System.out.println(palinList2);
      
      PalinList palinList3 = new PalinList("racecar is racecar");
      System.out.println(palinList3);
      
      PalinList palinList4 = new PalinList("1 2 3 a b c c b a 3 2 1");
      System.out.println(palinList4);
      
      PalinList palinList5 = new PalinList("chicken is a chicken");
      System.out.println(palinList5);
   }
}