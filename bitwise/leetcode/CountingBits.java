public class CountingBits {
    static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    static int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int result = countOnes(i);
            arr[i] = result;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] result = countBits(8);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
