//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.ArrayList;

public class NumberAnalyzer {
   private ArrayList<Number> list = new ArrayList<>();
   public NumberAnalyzer(String numbers) {
       String[] number = numbers.split(" ");
       for (int i = 0; i < number.length; i++) {
           list.add(new Number(Integer.parseInt(number[i])));
       }
   }
   public void setList(String numbers) {
       String[] number = numbers.split(" ");
       for (int i = 0; i < number.length; i++) {
           list.add(new Number(Integer.parseInt(number[i])));
       }
   }
   public int countOdds() {
       int countOdd = 0;
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).isOdd() == true) {
               countOdd++;
           }
       }
       return countOdd;
   }
   public int countEvens() {
       int countEven = 0;
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).isOdd() == false) {
               countEven++;
           }
       }
       return countEven;
   }
   public int countPerfect() {
       int countPerfect = 0;
       for (int i = 0; i < list.size(); i++) {

           if (list.get(i).isPerfect()) {

               countPerfect++;
           }
       }
       return countPerfect;
   }
   public String toString() {
       return "" + list;
   }
}