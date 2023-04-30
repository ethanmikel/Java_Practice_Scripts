//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class StringSearch {

    public static int countWords(String sent, String word) {
        int count = 0;
        for(int i = 0; i < sent.length() - word.length() + 1; i++){
            if(sent.substring(i, i+word.length()).equals(word)){
                count++;
            }
        }
        return count;
    }
    public static int countLetters(String sent, String letter) {
        int count = 0;
        for(int i = 0; i < sent.length(); i++){
            if(sent.substring(i, i+1).equals(letter)){
                count++;
            }
        }
        return count;
    }
}