package recursion;

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

    public static void main(String[] args) {
        System.out.println(moveAllX("axbxcxd"));
    }
}
