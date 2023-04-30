//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Word {
    private String word;
    public static String vowels = "aeiouAEIOU";
    public Word() {
        word = "";
    }
    public Word(String word) {
        this.word = word;
    }
    public int getNumVowels() {
        int count = 0;
        for (char letter : word.toCharArray()) {
            for (char vowel : vowels.toCharArray()) {
                if (letter == vowel) {
                    count++;
                }
            }
        }
        return count;
    }
    public int getLength() {
        return word.length();
    }
    @Override
    public String toString() {
        return word;
    }
}