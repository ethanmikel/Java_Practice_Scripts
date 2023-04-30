//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TheLine
{
  private String line;

    public TheLine() {
        setLine("");
    }

    public TheLine(String s) {
        setLine(s);
    }

    public void setLine(String s) {
        this.line = s;
    }

    public int getCount() {
        return line.split(" ").length;
    }

    public int getLargest() {
        int largest = Integer.MIN_VALUE;
        String[] numbers = line.split(" ");
        for(int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) > largest) {
                largest = Integer.parseInt(numbers[i]);
            }
        }
        return largest;
    }

    public String getLine() {
        return line;
    }

    public String toString() {
        return getLine();
    }

}