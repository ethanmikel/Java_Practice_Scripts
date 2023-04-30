//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LineTotaller {

    private String line;

    public LineTotaller() {
        setLine("");
    }

    public LineTotaller(String s) {
        setLine(s);
    }

    public int getSum() {
        int total = 0;
        String[] numbers = line.split(" ");
        for(int i = 0; i < numbers.length; i++) {
            total += Integer.parseInt(numbers[i]);
        }
        return total;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String s) {
        this.line = s;
    }
    public String toString() {
        return getLine();
    }
}