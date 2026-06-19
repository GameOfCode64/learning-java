package maths;

public class CountEvenandOddDigits {
    public static void main(String[] argu) {
        int n = 123456;
        int odd = 0;
        int even = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.err.println("Even: " + even);
        System.err.println("Odd: " + odd);
    }
}
