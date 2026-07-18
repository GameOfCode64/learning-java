public class SumofGCDofFormedPairs {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            int gcd = gcd(nums[i], max);
            prefixGcd[i] = gcd;
        }

        Arrays.sort(prefixGcd);

        long sum = 0;

        int i = 0;
        int j = prefixGcd.length - 1;

        while (i < j) {
            int gcd = gcd(prefixGcd[i], prefixGcd[j]);
            sum += gcd;
            i++;
            j--;
        }

        return sum;
    }
}