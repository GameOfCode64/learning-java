public class HappyNumber {
    // ! Problem
    // * */ A number is called Happy if:
    // * */ Replace the number with the sum of the squares of its digits.
    // * */ Repeat the process.
    // * */ If you eventually reach 1, it's a Happy Number.
    // * */ If you enter a cycle and never reach 1, it's no
    public static void main(String[] argu) {
        int n = 17;
        while (n != 1 && n != 4) {
            int sqr = 0;

            while (n > 0) {
                int rem = n % 10;
                sqr += rem * rem;
                n /= 10;
            }

            n = sqr;
        }

        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}