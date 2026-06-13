public class ReverseVowelsofaString {

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    static void swap(char[] str, int n1, int n2) {
        char temp = str[n1];
        str[n1] = str[n2];
        str[n2] = temp;
    }

    static String reverseVowels(String s) {
        char[] str = s.toCharArray();

        int start = 0;

        int end = str.length - 1;

        while (start <= end) {
            char e1 = str[start];
            char e2 = str[end];

            if (isVowel(e1) == true && isVowel(e2) == false) {
                end--;
            } else if (isVowel(e1) == false && isVowel(e2) == true) {
                start++;
            } else if (isVowel(e1) == false && isVowel(e2) == false) {
                start++;
                end--;
            } else {
                swap(str, start, end);
                start++;
                end--;
            }
        }

        return String.valueOf(str);
    }

    public static void main(String argu[]) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
