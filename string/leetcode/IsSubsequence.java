public class IsSubsequence {
    static boolean isSubsequence(String s, String t) {
        char[] str = s.toCharArray();
        char[] target = t.toCharArray();

        int prev = -1;
        for (int i = 0; i < str.length; i++) {
            boolean found = false;
            for (int j = prev + 1; j < target.length; j++) {
                if (str[i] == target[j]) {
                    prev = j;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
