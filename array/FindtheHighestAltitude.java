public class FindtheHighestAltitude {
    static int largestAltitude(int[] gain) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] argu) {
        int[] gain = { -5, 1, 5, 0, -7 };

        System.out.println(largestAltitude(gain));

    }
}
