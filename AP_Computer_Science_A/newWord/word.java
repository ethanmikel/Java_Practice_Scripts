public class word {
    public static void main(String[] args) {
        String words[] = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

        for (String newWord : words) {
            if (newWord.lastIndexOf("ing") == newWord.length() - 3) {
                System.out.println(newWord);
           }
        }
    }
}