//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortRunner
{            
public static void main(String args[])
        {
                int arr1[] = {9,5,3,2};

                MergeSort merge1 = new MergeSort();
                merge1.sort(arr1, 0, arr1.length - 1);
                
                System.out.println("\n");
                
                int arr2[] = {19,52,3,2,7,21};

                MergeSort merge2 = new MergeSort();
                merge2.sort(arr2, 0, arr2.length - 1);
                
                System.out.println("\n");
                
                int arr3[] = {3,15,61,11,7,9,2};

                MergeSort merge3 = new MergeSort();
                merge3.sort(arr3, 0, arr3.length - 1);

                
        }
}