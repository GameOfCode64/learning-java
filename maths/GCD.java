package maths;

public class GCD {
    // ! Find GCD(Greatest common divisor)
    public static void main(String[] argu) {
        int a = 7;
        int b = 7;
        int GCD = 0;
        int limit = 0;

        if (a < b) {
            limit = a;
        } else {
            limit = b;
        }

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        System.err.println("GCD: " + GCD);
    }
}
