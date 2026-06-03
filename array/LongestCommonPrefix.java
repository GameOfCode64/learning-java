public class LongestCommonPrefix {
    // ! Longest Common Prefix
    // * */ Input: strs = ["flower","flow","flight"]
    // * */ Output: "fl"
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            int j = 0;

            while (j < prefix.length() && j < str.length()) {
                if (prefix.charAt(j) != str.charAt(j)) {
                    break;
                }
                j++;
            }

            prefix = prefix.substring(0, j);

        }
        System.out.println(prefix);
    }
}
