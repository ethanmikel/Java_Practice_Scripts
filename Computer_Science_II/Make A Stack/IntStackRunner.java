//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ethan Mikel

import java.util.ArrayList;
import static java.lang.System.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class IntStackRunner {
   public static void main ( String[] args) {
   
       Stack<Integer> s = new Stack<Integer>();
       s.push(51);
       s.push(35);
       s.push(51);
       s.push(2);
       System.out.println(fun(s));   
   }
}

