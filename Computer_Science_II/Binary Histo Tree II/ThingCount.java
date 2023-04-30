//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.HashMap;

public class ThingCount implements Comparable
{
    private int count;
    private Object thing;

    public ThingCount()
    {
        thing = null;
        count = 0;
    }

    public ThingCount(Object thang, int cnt)
    {
        thing = thang;
        count = cnt;
    }

    public void setThing(Object obj)
    {
        thing = obj;
    }

    public void setCount(int cnt)
    {
        count = cnt;
    }

    public Object getThing()
    {
        return thing;
    }

    public int getCount()
    {
        return count;
    }

    public boolean equals(Object obj)
    {
        ThingCount other = (ThingCount)obj;
        if(thing.equals(other.getThing()) && other.getCount() == count)
            return true;
        return false;
    }

    public int compareTo(Object obj)
    {
        ThingCount other = (ThingCount)obj;
        if(thing.equals(other.getThing()) && count == other.getCount())
            return 0;
        if(count > other.getCount())
            return 1;
        return -1;
    }

    public String toString()
    {
        return ""+thing + " - " + count;
    }
}