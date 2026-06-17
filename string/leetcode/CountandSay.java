package leetcode;

public class CountandSay {
    static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        int count = 1;
        char prev = num.charAt(0);

        for (int i = 1; i < num.length(); i++) {
            char element = num.charAt(i);

            if (prev == element) {
                count++;
            } else {
                sb.append(count);
                sb.append(prev);
                count = 1;
                prev = element;
            }

        }

        sb.append(count);
        sb.append(prev);

        return sb.toString();
    }

    public static void main(String[] argu) {
        int n = 1;
        System.out.println(countAndSay(n));
    }
}
