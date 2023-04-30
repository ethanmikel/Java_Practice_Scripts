//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Random;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr = new int[size];
      Random random = new Random();
      for (int i= 0; i< size; i++){
      arr[i]= 1 + random.nextInt(10); 
      }
      return arr;
	}
	public static void shiftEm(int[] array)
	{
      int left = 0, right = array.length-1, temp;
      while (left <= right) {
         if(array[left] == 7) {
            left++;
         }
         else if(array[right] != 7) {
            right--;
         }
         else {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
         }
      }
	}
}