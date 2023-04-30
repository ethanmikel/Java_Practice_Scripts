//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class SpiralMatrix {
   private int size;
   private int[][] array;
   public SpiralMatrix(int size) {
       this.size = size;
   }
   public void setSize(int size) {
       this.size = size;
   }
   public void createSpiral() {
       array = new int[size][size];
       int value = 1;
       int minCol = 0;
       int maxCol = size - 1;
       int minRow = 0;
       int maxRow = size - 1;

       while (value <= size * size) {
           for (int i = minRow; i <= maxRow; i++) {
               array[i][minCol] = value;
               value++;
           }
           for (int i = minCol + 1; i <= maxCol; i++) {
               array[maxRow][i] = value;
               value++;
           }
           for (int i = maxRow - 1; i >= minRow; i--) {
               array[i][maxCol] = value;
               value++;
           }
           for (int i = maxCol - 1; i >= minCol + 1; i--) {
               array[minRow][i] = value;
               value++;
           }
           minCol++;
           minRow++;
           maxCol--;
           maxRow--;
       }
   }
   public String toString() {
       String output="";
       for(int i=0; i<size; i++) {
           for(int j=0; j<size; j++) {
               output += array[i][j]+"\t";
           }
           output += "\n";
       }
       return output;
   }
}