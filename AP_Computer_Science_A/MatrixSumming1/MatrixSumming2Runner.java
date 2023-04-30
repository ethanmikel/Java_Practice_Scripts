//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner {
        public static void main(String[] args) throws IOException {
                Scanner in = new Scanner(new File("matsum.dat"));
                MatrixSumming2 mat = new MatrixSumming2();
                int t = in.nextInt();
                while(t-- > 0) {
                        int r = in.nextInt();
                        int c = in.nextInt();
                        
                        System.out.printf("The sum of %d,%d is %d.\n", r, c, mat.sum(r, c));
                }
        }
}