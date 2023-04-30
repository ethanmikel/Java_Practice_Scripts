//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class OddEvenCounter {

    private String line;

    public OddEvenCounter() {
        setLine("");
    }

    public OddEvenCounter(String s) {
        setLine(s);
    }

    public int getEvenCount() {
        int num, count = 0;
        String[] numbers = line.split(" ");
        for(int i = 0; i < numbers.length; i++) {
            num = Integer.parseInt(numbers[i]);
            if(num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getOddCount() {
        int num, count = 0;
        String[] numbers = line.split(" ");
        for(int i = 0; i < numbers.length; i++) {
            num = Integer.parseInt(numbers[i]);
            if(num % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String s) {
        this.line = s;
    }
    public String toString() {
        return getLine()+" is even.\n\n";
    }

}