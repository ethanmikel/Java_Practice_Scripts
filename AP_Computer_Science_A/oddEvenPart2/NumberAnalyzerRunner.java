//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberAnalyzerRunner {
   public static void main(String[] args) {
       NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");       
       System.out.println(test);
       System.out.println("Odd count = "+test.countOdds());
       System.out.println("Even count = "+test.countEvens());
       System.out.println("Perfect count = "+test.countPerfect());
       
       NumberAnalyzer test2 = new NumberAnalyzer("5 12 3 7 28 496 81 65 33 11");
       System.out.println(test2);
       System.out.println("Odd count = "+test2.countOdds());
       System.out.println("Even count = "+test2.countEvens());
       System.out.println("Perfect count = "+test2.countPerfect());
   }
}