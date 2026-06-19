package maths;

public class ArmstrongNumber {
    public static void main(String[] argu) {
        // Example: 153 = 1^3 + 5^3 + 3^3
        int n = 370;
        int copy = n;
        int cube = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            cube += rem * rem * rem;
        }

        if (copy == cube) {
            System.err.println("The no is ArmStrong");
        } else {
            System.err.println("The no is Not a ArmStrong " + cube);
        }
    }
}
