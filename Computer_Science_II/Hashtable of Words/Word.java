//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Word {
    private final String value;

    public Word(String value) {
        this.value = value.strip();
    }

    public Word() {
        value = "";
    }

    public String getValue() {
        return value;
    }

    public boolean equals(Object other) {

        if (this == other) return true;

        if (!(other instanceof Word))
            return false;

        Word otherWord = (Word) other;

        return value.equals(otherWord.value);
    }

    public int hashCode() {

        int vowels = 0;

        for (int i = 0; i < value.length(); ++i) {
            switch (value.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' : ++vowels;
            }
        }
        return vowels * value.length();
    }

    public String toString() {
        return "Word {" +"value='" + value + '\'' +'}';
    }
}