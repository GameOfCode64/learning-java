package leetcode;

public class ReverseWordsinaString {

    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        char[] chars = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}