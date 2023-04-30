//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

class MatrixSumming2 {
        int m[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 },
                        { 6, 7, 1, 2, 5 }, { 6, 7, 8, 9, 0 }, { 5, 4, 3, 2, 1 } };

        public int sum(int r, int c) {
                int s = 0;
                for (int i = -1; i < 2; i++) {
                        for (int j = -1; j < 2; j++) {

                                int row = r + i;
                                int col = c + j;

                                if (row >= 0 && row < m.length && c >= 0 && c < m[row].length) {
                                        s += m[row][col];
                                }

                        }
                }
                return s;
        }
}
