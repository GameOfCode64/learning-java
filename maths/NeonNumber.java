package maths;

public class NeonNumber {

    public static boolean isNeonNumber(int n) {
        int sum = 0;
        int copy = n;
        int sqr = n * n;

        while (sqr > 0) {
            int rem = sqr % 10;
            sqr /= 10;
            sum += rem;
        }

        if (sum == copy) {
            return true;
        }

        return false;
    }

    public static void main(String[] argu) {

        int n = 12;

        if (isNeonNumber(n)) {
            System.out.println("Is a Neon No");
        } else {
            System.out.println("Is Not a Neon No");
        }

    }
}
