public class LengthofLastWord {
    static int lengthOfLastWord(String s) {
        String str = s.trim();
        str = str.replaceAll("   ", " ");
        String[] arr = str.split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
