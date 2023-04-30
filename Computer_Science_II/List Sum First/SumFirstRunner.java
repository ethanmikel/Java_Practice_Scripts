//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

//add imports as needed

import java.util.Arrays;
import java.util.List;

public class SumFirstRunner {
   public static void main(String[] args) {
       //creating list object and initilizing them with values
       List<Integer> r1=Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5);
       List<Integer> r2=Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
       List<Integer> r3=Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
       List<Integer> r4=Arrays.asList(32767);
       List<Integer> r5=Arrays.asList(255,255);
       List<Integer> r6=Arrays.asList(9,10,-88,100,-555,2);
       List<Integer> r7=Arrays.asList(10,10,10,11,456);
       List<Integer> r8=Arrays.asList(-111,1,2,3,9,11,20,1);
       List<Integer> r9=Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6);
       List<Integer> r10=Arrays.asList(12,15,18,21,23,1000);
       List<Integer> r11=Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0);
       List<Integer> r12=Arrays.asList(9,10,-8,10000,-5000,-3000);
       // calling go() to find sum
       int result1=ListSumFirst.go(r1);
       int result2=ListSumFirst.go(r2);
       int result3=ListSumFirst.go(r3);
       int result4=ListSumFirst.go(r4);
       int result5=ListSumFirst.go(r5);
       int result6=ListSumFirst.go(r6);
       int result7=ListSumFirst.go(r7);
       int result8=ListSumFirst.go(r8);
       int result9=ListSumFirst.go(r9);
       int result10=ListSumFirst.go(r10);
       int result11=ListSumFirst.go(r11);
       int result12=ListSumFirst.go(r12);
       //printing result of each list
       System.out.println(result1);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(result5);
       System.out.println(result6);
       System.out.println(result7);
       System.out.println(result8);
       System.out.println(result9);
       System.out.println(result10);
       System.out.println(result11);
       System.out.println(result12);
      
      
   }

}