//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
   private List<Integer> list;

   public Heap()
   {
                list = new ArrayList<Integer>();
   }

   public void add(int value)
   {
                list.add(value);
                swapUp(list.size()-1);
   }

   public void swapUp(int bot)
   {
                int curr = bot;
                while(list.get(curr) > list.get((curr-1)/2))
                {
                        swap(curr, (curr-1)/2);
                        curr = (curr-1)/2;
                }
   }

   public void remove( )
   {
                list.set(0,list.get(list.size()-1));
                list.remove(list.size()-1);
                swapDown(0);
   }

   public void swapDown(int top)
   {
                if((top > (list.size()-1)/2) && (top < list.size()))
                return;
                int leftChild = Integer.MIN_VALUE;
                if(top*2+1 < list.size())
                        leftChild = list.get(top*2+1);
                int rightChild = Integer.MIN_VALUE;
                if(top*2+2 < list.size())
                        rightChild = list.get(top*2+2);
                if(list.get(top) < leftChild || list.get(top) < rightChild)
                {
                        if(leftChild >= rightChild)
                        {
                                swap(top, top*2+1);
                                swapDown(top*2+1);
                        }
                        else {
                                swap(top, top*2+2);
                                swapDown(top*2+2);
                        }
                }
   }
  
   private void swap(int start, int finish)
   {
                int t = list.get(start);
                list.set(start, list.get(finish));
                list.set(finish, t);
   }

   public static int min(int a, int b)
   {
        if(a<b) return a;
        else return b;
   }
   public void print()
   {
                out.println("\n\nPRINTING THE HEAP!\n\n");
                int size = list.size();
                int a = 0;
                int c = 1;
                while(a < size)
                {
                        int b=a;
                        for(int i=a; i<min(size, b+c); i++)
                        {
                                out.print(list.get(i)+" ");
                                a+=1;
                        }
                        c = c*2;
                        out.print("\n");
                }
   }

   public String toString()
   {
                return list.toString();
   }
}