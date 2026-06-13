
public class ValidPalindrome {
    static boolean isPalindrome(String s) {
        if (s == " ") {
            return true;
        }

        s = s.toLowerCase();

        String cleaned = s.trim().replaceAll(" ", "");
        String result = cleaned.replaceAll("[,:]", "");

        int start = 0;
        int end = result.length() - 1;

        while (start <= end) {
            if (result.charAt(start) != result.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
