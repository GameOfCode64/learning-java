public class BinaryGap {
    static int binaryGap(int n) {
        int max = 0;
        int prev = -1;
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {

                if (prev != -1) {
                    max = Math.max((count - prev), max);
                }

                prev = count;
            }
            n = n >> 1;
            count++;
        }
        return max;
    }

    public static void main(String[] argu) {
        System.out.println(binaryGap(8));
    }
}