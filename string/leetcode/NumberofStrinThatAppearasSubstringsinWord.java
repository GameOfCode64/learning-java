package leetcode;

public class NumberofStrinThatAppearasSubstringsinWord {
    static boolean isContain(String word, String patterns) {
        String[] arr = patterns.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (word.contains(arr[i])) {
                return true;
            }
        }
        return false;
    }

    static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (isContain(word, patterns[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] argu) {
        String[] patterns = { "a", "abc", "bc", "d" };
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
}
