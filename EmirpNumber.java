public class EmirpNumber {
    // ! An Emirp Number is:

    // ! A prime number.
    // ! Its reverse is also prime.
    // ! The reversed number is different from the original

    // * Case -> 17 -> rev -> 71 -> Both are prime -> Emirp Number otherwise not

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] argu) {
        int n = 27;
        int nCopy = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            rev = rev * 10 + rem;
        }

        if (nCopy != rev) {
            if (isPrime(nCopy) == true && isPrime(rev) == true) {
                System.out.println("Emirp Number");
            } else {
                System.out.println("Not Emirp Number");
            }
        } else {
            System.out.println("Both numbers are same");
        }

    }
}
