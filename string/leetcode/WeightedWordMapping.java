public class WeightedWordMapping {
    static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            int sum = 0;

            char[] word = words[i].toCharArray();

            while (j < word.length) {
                char letter = word[j];
                int pos = letter - 'a' + 1;
                sum += weights[pos - 1];
                j++;
            }

            int mod = sum % 26;
            mod = mod + 1;
            char element = (char) ('z' - mod + 1);

            str.append(element);

            sum = 0;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String[] words = { "abcd", "def", "xyz" };
        int[] weights = { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 };
        System.out.println(mapWordWeights(words, weights));

    }
}