//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester 
{
    private Queue<String> pQueue; 

    public PQTester() 
    {
        pQueue = new PriorityQueue<String>(); 
    }

    public PQTester(String list) 
    {
        pQueue = new PriorityQueue<String>(); 
        this.setPQ(list); 
    }

    public void setPQ(String list) 
    {
        String[] words = list.split("\\s"); 
        for(String word : words) 
            pQueue.add(word); 
    }

    public Object getMin() 
    {
        String s = pQueue.peek(); 
        return s; 
    }

    public String getNaturalOrder() 
    {
        String output= ""; 
        while(!pQueue.isEmpty()) 
            output += pQueue.poll() + " "; 
        return output; 
    }
    public String toString() 
    {
        return String.valueOf(pQueue); 
    }
}