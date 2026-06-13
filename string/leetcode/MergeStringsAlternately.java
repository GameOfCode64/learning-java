public class MergeStringsAlternately {
    static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int w1I = 0;
        int w2I = 0;

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        while (w1I < w1.length || w2I < w2.length) {
            char e1 = w1[w1I];
            char e2 = w2[w2I];
            str.append(e1);
            str.append(e2);
            w1I++;
            w2I++;
        }

        while (w1I < w1.length) {
            char e = w1[w1I];
            str.append(e);
            w1I++;
        }

        while (w2I < w2.length) {
            char e = w2[w2I];
            str.append(e);
            w2I++;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));

    }
}
