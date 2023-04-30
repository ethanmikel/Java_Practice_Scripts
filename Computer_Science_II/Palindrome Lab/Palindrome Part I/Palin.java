//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class Palin {

    private String word;

    public Palin(String word) {
        this.word = word;
    }

    public int getLength() {
        return word.length();
    }

    public String getWord() {
        return word;
    }

    public boolean isPalin() {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public String toString() {
        return word;
    }
}