//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListSumFirstRunner {
    public static void main(String[] args) {
        ListSumFirst ls = new ListSumFirst();
        System.out.println(ls.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5)));
        System.out.println(ls.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
        System.out.println(ls.go(Arrays.asList(255,255)));
    }
}