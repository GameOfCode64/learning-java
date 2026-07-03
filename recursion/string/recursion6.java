package string;

public class recursion6 {

    public static String remove(String s, int count) {

        if (count == s.length()) {
            return "";
        }

        String current = "";

        if (s.toLowerCase().charAt(count) != 'a') {
            current = String.valueOf(s.charAt(count));
        }

        return current + remove(s, count + 1);
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

    static String removeAppFormApple(String s, int index) {
        if (index >= s.length()) {
            return "";
        }

        if (s.startsWith("app", index) && !s.startsWith("apple", index)) {
            return removeAppFormApple(s, index + 3);
        }

        return s.charAt(index) + removeAppFormApple(s, index + 1);
    }

    public static void main(String[] argu) {
        System.out.println(remove("baccad", 0));
        System.out.println(removeApple("bapplecdapple", 0));
        System.out.println(removeAppFormApple("bapplecdapple", 0));
    }

}
