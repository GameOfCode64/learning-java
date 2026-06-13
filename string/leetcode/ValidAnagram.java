
public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }

        if (s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        for (int i = 0; i < t.length(); i++) {
            char word = t.charAt(i);
            if (!s.contains(String.valueOf(word))) {
                return false;
            } else {
                s = s.replaceFirst(String.valueOf(word), "");
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "a";
        String t = "c";

        System.out.println(isAnagram(s, t));
    }
}
