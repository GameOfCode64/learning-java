public class PowerofTwo {

    static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        if ((n & (n - 1)) == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] argu) {
        System.out.println(isPowerOfTwo(3));
    }
}