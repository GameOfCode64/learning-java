public class ArrangingCoins {
    static int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        int out = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long needCoin = (long) mid * (mid + 1) / 2;
            if (needCoin == n) {
                return mid;
            } else if (needCoin < n) {
                out = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}