
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;
public class testB {
    public static void main (String [] args){
        int[][] matrix = new int [4][8];
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = row * col + col / 2 + row * (col +1);
            }
        }
        System.out.println("Matrix values");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(matrix[1][2]);
        System.out.println(matrix[1][3]);
        System.out.println(matrix[2][6]);
        System.out.println(matrix[1][5]);
        System.out.println(matrix[1][6]);
        
        int val = matrix[2][0] + matrix[0][0];
        System.out.println(val);
        
        System.out.println(matrix[2][2]);
        
        val = matrix[2][5] - matrix[1][1];
        System.out.println(val);
        
        System.out.println(matrix[2][7]);
        System.out.println(matrix[2][5]);
        
        val = matrix[3][6] / matrix[2][1];
        System.out.println(val);
        
        val = (matrix[1][1] + matrix[1][2]) / 3;
        System.out.println(matrix[val][val]);
    }
}