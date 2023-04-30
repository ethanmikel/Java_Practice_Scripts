//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
    public static int go( List<Integer> ray )
    {
        int sum = 0;
        for(int i = 0; i < ray.size(); i++) {
            sum += ray.get(i);
        }
        return sum;
    }
}