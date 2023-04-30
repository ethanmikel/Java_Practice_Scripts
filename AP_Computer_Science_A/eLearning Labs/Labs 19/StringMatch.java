public class StringMatch {

   /**
   * Output:
   *
   * If the letters are all the same, return "yep".
   *
   * If no more than 2 letters differ, return "close".
   *
   * If more than 2 letters differ, return "nope".
   *
   * @param word1
   * @param word2
   * @return
   */
   public static String checkMatch(String word1, String word2) {
       // getting smaller length word
       int smallLen = (word1.length() > word2.length()) ? word2.length() : word1.length();
       int noDiff = 0;// counting how many chars are same
       for (int i = 0; i < smallLen; i++) {// checking only till the word is small length
           if (word1.charAt(i) == word2.charAt(i)) { // check if char in word1 is same as word2
               noDiff++; // increment if char is same
           }
       }

       if (noDiff == smallLen) { // if all are equal then return yep
           return "yep";
       }
       return noDiff >= 2 ? "close" : "nope"; // if greater than 2 return close if not return nope

   }

   public static void main(String[] args) {

       String input1_word1 = "dog";
       String input1_word2 = "hog";
       System.out.println(checkMatch(input1_word1, input1_word2));

       String input2_word1 = "applepie";
       String input2_word2 = "funny";
       System.out.println(checkMatch(input2_word1, input2_word2));

       String input3_word1 = "454";
       String input3_word2 = "404";
       System.out.println(checkMatch(input3_word1, input3_word2));

       String input4_word1 = "454";
       String input4_word2 = "454";
       System.out.println(checkMatch(input4_word1, input4_word2));
   }

}