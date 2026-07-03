package string;

import java.util.ArrayList;

public class recursion7 {

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> list = new ArrayList<>();

    static ArrayList<String> subSeqArray(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(String.valueOf(p));
            return list;
        }

        char ch = up.charAt(0);

        subSeqArray(p + ch, up.substring(1), list);
        subSeqArray(p, up.substring(1), list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(subSeqArray("", "abc", list));
    }
}
