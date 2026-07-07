
public class rec2 {
    static void subSeq(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        int ascii = (int) ch;
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));
        ArrayList<String> asciiBranch = subSeqRet(p + ascii, up.substring(1));
        left.addAll(right);
        left.addAll(asciiBranch);
        return left;
    }

    public static void main(String[] argu) {
        System.out.println(subSeqRet("", "abc"));
    }
}