package recursion;

import java.util.HashMap;

public class rec3 {
    static void print(String s) {

        if (s.length() == 0) {
            return;
        }

        char ch = s.charAt(0);
        s = s.substring(1);

        System.out.println(ch);

        print(s);
    }

    static int lengthOfString(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return 1 + lengthOfString(s.substring(1));
    }

    static String removeA(String s) {

        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        if (ch == 'a') {
            return removeA(s.substring(1));
        } else {
            return ch + removeA(s.substring(1));
        }
    }

    static String removeApple(String s, int index) {
        if (index >= s.length()) {
            return "";
        }

        if (s.startsWith("apple", index)) {
            return removeApple(s, index + 5);
        }

        return s.charAt(index) + removeApple(s, index + 1);
    }

    static String removeAppNotApple(String s, int index) {
        if (index >= s.length()) {
            return "";
        }

        if (s.startsWith("app", index) && !s.startsWith("apple", index)) {
            return removeAppNotApple(s, index + 3);
        }

        return s.charAt(index) + removeAppNotApple(s, index + 1);
    }

    static int count(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char ch = s.charAt(0);

        if (ch == 'a') {
            return 1 + count(s.substring(1));
        } else {
            return count(s.substring(1));
        }
    }

    static String returnVowels(String s) {

        if (s.length() == 0) {
            return "";
        }

        char ch = s.charAt(0);
        boolean isVowels = checkVowel(ch);

        if (isVowels) {
            return ch + returnVowels(s.substring(1));
        } else {
            return returnVowels(s.substring(1));
        }

    }

    private static boolean checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    static String removeDuplicates(String s, char lastCh) {

        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        boolean isDuplicates = checkDuplicates(lastCh, ch);

        if (!isDuplicates) {
            return ch + removeDuplicates(s.substring(1), ch);
        } else {
            return removeDuplicates(s.substring(1), ch);
        }

    }

    private static boolean checkDuplicates(char l, char c) {
        if (l == c) {
            return true;
        }

        return false;
    }

    public static String moveAllX(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        if (ch == 'x') {

            return moveAllX(s.substring(1)) + ch;

        } else {
            return ch + moveAllX(s.substring(1));
        }

    }

    static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        return reverse(s.substring(1)) + ch;

    }

    static String removeAllAdjacent(String s, String n, int count) {
        if (count >= s.length()) {
            return n;
        }
        if (count == s.length() - 1) {
            return removeAllAdjacent(s, n + s.charAt(count), count + 1);
        }

        char first = s.charAt(count);
        char second = s.charAt(count + 1);

        if (first != second) {
            return removeAllAdjacent(s, n + first, count + 1);
        } else {
            return removeAllAdjacent(s, n, count + 2);
        }
    }

    static String returnUppercase(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        if (Character.isUpperCase(ch)) {
            return String.valueOf(ch);
        } else {
            return returnUppercase(s.substring(1));
        }
    }

    // --------------------------------------------------------------------------------------------------

    // return last Uppercase Latter
    static String returnLastUppercaseLatter(String s, char lastUpper) {
        if (s.isEmpty()) {
            return String.valueOf(lastUpper);
        }
        char ch = s.charAt(0);

        if (Character.isUpperCase(ch)) {
            return returnLastUppercaseLatter(s.substring(1), lastUpper = ch);
        }
        return returnLastUppercaseLatter(s.substring(1), lastUpper);
    }

    // return index of first vowel
    static int returnFirstVowel(String s, int index) {
        if (s.isEmpty()) {
            return -1;
        }
        char ch = s.charAt(0);
        boolean isVowel = checkVowel(ch);

        if (isVowel) {
            return index;
        }

        return returnFirstVowel(s.substring(1), index + 1);
    }

    // count duplicate groups.

    static HashMap<String, Integer> map = new HashMap<>();

    static int countDuplicateGroups(String s, int count, char last) {
        if (s.isEmpty()) {
            return count;
        }

        char ch = s.charAt(0);

        if (ch == last) {
            return countDuplicateGroups(s.substring(1), count, ch);
        } else {
            return countDuplicateGroups(s.substring(1), count + 1, ch);
        }

    }

    // find the longest word
    static int findLongestWord(String s, int max, int count, int length) {

        if (length >= s.length()) {
            return Math.max(count, max);
        }
        char ch = s.charAt(length);
        if (ch == ' ') {
            return findLongestWord(s, Math.max(count, max), count = 0, length + 1);
        }

        return findLongestWord(s, max, count + 1, length + 1);
    }

    // Huffman code
    static String huffmanCode(String s, String n, char lastCh, int count, int index) {
        if (index >= s.length()) {
            return n + lastCh + count;
        }

        char ch = s.charAt(index);

        if (ch == lastCh) {
            return huffmanCode(s, n, lastCh, count + 1, index + 1);
        } else {

            return huffmanCode(s, n + lastCh + count, ch, 1, index + 1);
        }
    }

    public static void main(String[] args) {
        String input = "AAABBC";

        String result = huffmanCode(input, "", input.charAt(0), 1, 1);

        System.out.println(result);
    }
}
