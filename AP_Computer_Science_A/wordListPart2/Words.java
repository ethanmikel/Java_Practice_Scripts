




//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words {
    private ArrayList<Word> words;
    public Words() {
        words = new ArrayList<>();

    }
    public Words(String wordList) {
        words = new ArrayList<>();
        setWords(wordList);

    }
    public void setWords(String wordList) {
        String[] wordArray = wordList.split("\\s+");
        for (String word : wordArray) {
            words.add(new Word(word));
        }
    }
    public int countWordsWithXChars(int size) {
        int count = 0;
        for (Word word : words) {
            if (word.getLength() == size) {
                count++;
            }
        }
        return count;
    }
    public int removeWordsWithXChars(int size) {
        int count = 0;
        ArrayList<Word> wordToBeRemoved = new ArrayList<>();
        for (Word word : words) {
            if (word.getLength() == size) {
                wordToBeRemoved.add(word);
            }
        }

        for (Word w : wordToBeRemoved) {
            count += w.getNumVowels();
            words.remove(w);
        }
        return count;
    }
    public int countWordsWithXVowels(int numVowels) {
        int count = 0;

        for (Word word : words) {
            if (word.getNumVowels() == numVowels) {
                count++;
            }
        }

        return count;
    }
    public String toString() {
        return words.toString();
    }
    public static void main(String[] args) {
        Words test = new Words("one two three four five six seven alligator");
        System.out.println(test);
        System.out.println("2 vowels = "+test.countWordsWithXVowels(2));
        System.out.println("3 vowels = "+test.countWordsWithXVowels(3));
        System.out.println("4 vowels = "+test.countWordsWithXVowels(4));
        System.out.println("2 chars = "+test.countWordsWithXChars(2));
        System.out.println("3 chars = "+test.countWordsWithXChars(3));
        System.out.println("4 chars = "+test.countWordsWithXChars(4));
        System.out.println("5 chars = "+test.countWordsWithXChars(5));

    }
}