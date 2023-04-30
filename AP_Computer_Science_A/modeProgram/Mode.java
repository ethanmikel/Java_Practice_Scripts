/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class Mode {
   public static int mode(int[] ray)
    {
        Arrays.sort(ray); 
        int permantCount = 0;
        int tempCount = 0;
        int num =0;
        int highNum =0;
        for (int i = 0; i < ray.length; i++)
         {  
            num = ray[i];
            tempCount = 0; 
             for (int j = i + 1; j < ray.length; j++)
             {
                 if (num == ray[j]) {
                 tempCount++;
                }
            }
            if (tempCount > permantCount)
                {
                  highNum = num;
                  permantCount = tempCount;
                }
            else {
                highNum = ray[0];
            }
        }
        return highNum;
   }
   public static void main(String[] args) {
        int[] mode = new int[] {10,10,13,17,17,17,18,21};
        int[] mode2 = new int[] {54,54,54,60,60,70,85,85};
        int[] mode3 = new int[] {20,20,20,30,30,30,40,40,40};
        int[] mode4 = new int[] {50};
        System.out.println(mode(mode));
        System.out.println(mode(mode2));
        System.out.println(mode(mode3));
        System.out.println(mode(mode4));
   }
}