//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming1Runner
{
    public static void main( String args[] ) throws Exception
    {
        int[][] mat = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 0},{6, 7, 1, 2, 5},{6, 7, 8, 9, 0},{5, 4, 3, 2, 1}};
        System.out.println("Matrix values");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe sum1 is :: " + MatrixSumming1.sum());
    }
}



