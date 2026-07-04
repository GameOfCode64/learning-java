public class rec1 {
    static void fun(int n) {

        if (n == 0)
            return;

        System.out.println(n);

        fun(n - 1);
        fun(n - 1);
    }

    static int binarySearch(int[] arr, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        System.out.println(mid);

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

    static int sumOfDigit(int n) {

        if (n == 0) {
            return 0;
        }

        int e = n % 10;
        n = n / 10;

        return e + sumOfDigit(n);
    }

    static int reverse(int n, int ans) {

        if (n == 0) {
            return ans;
        }

        int e = n % 10;
        n = n / 10;

        ans = ans * 10 + e;

        return reverse(n, ans);
    }

    static int reversePure(int n) {
        if (n >= 0 && n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        int numDigits = (int) Math.log10(remainingDigits) + 1;

        return lastDigit * (int) Math.pow(10, numDigits) + reversePure(remainingDigits);

    }

    public static void main(String[] args) {
        // int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // System.out.println(
        // binarySearch(arr, 14, 0, arr.length - 1));

        System.out.println(reversePure(1234));
    }
}