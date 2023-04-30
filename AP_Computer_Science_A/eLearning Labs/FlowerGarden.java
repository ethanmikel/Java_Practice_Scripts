package com.test;
import java.util.ArrayList; 
public class FlowerGarden {
   public ArrayList<String> testList;
   FlowerGarden() {
      testList = new ArrayList<>();
   }
   void addFlower(final String flowerName) {
      int flag = 0;
      for (final String s : testList) {
         final String[] s1 = s.split(" ");
         if (s1[1].equals(flowerName)) {
            int count = Integer.parseInt(s1[0]);
            count++;
            testList.remove(s);
            if (count >= 1 && count <= 9) {
               testList.add("0" + count + " " + s1[1]);
            }
            else {
               testList.add(count + " " + s1[1]);
            }
            flag = 1;
            break;
         }               
      }
      if (flag == 0) {
         testList.add("01 " + flowerName);
      }       
   }
   int findFlower(final String flowerName) {
      for (final String s : testList) {
         final String[] s1 = s.split(" ");
         if (s1[1].equals(flowerName)) {
            return testList.indexOf(s);
         }
      }
      return -1;      
   }       
   int getCount(final String flowerName) {
      final int indexOfFlower = findFlower(flowerName);
      if(indexOfFlower == -1) {
         return -1;              
      }
      final String[] s1 = testList.get(indexOfFlower).split(" ");
      return Integer.parseInt(s1[0]);         
   }       
   boolean inRange(final int position) {
      if ( position < testList.size() && position > -1 ) {
         return true;
      }               
      return false;   
   }       
   String getFlowerName(final int position) {
      if(!inRange(position)) {
         return "out of range";
      }               
      final String s1 = testList.get(position);
      final String[] s = s1.split(" ");
      return s[1];
   }       
   String maxFlower() {
      String name;
      final String s = testList.get(0);
      final String[] s1 = s.split(" ");
      int max = Integer.parseInt(s1[0]);
      name = s1[1];
      for (int i = 1; i < testList.size(); i++) {
         final String[] s2 = testList.get(i).split(" ");
         if (Integer.parseInt(s2[0]) > max) {
            max = Integer.parseInt(s2[0]);
            name = s2[1];
         }
      }               
      if (max >= 1 && max <= 9) {
         return "0" + max + " " + name;
      }
      else {
         return max + " " + name;
      }
   }       
   public ArrayList<String> toString1() {
      return testList;       
   }
}  
