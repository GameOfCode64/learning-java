package maths;

public class RotateDigitsRightbyOne {
    // ! Problem -> Move the last digit to the front.
    // ! Input -> 1234 | Output -> 4123
    public static void main(String[] argu) {
        int n = 12345;
        int rotatedNumber = 0;

        int lastDigit = n % 10;
        n /= 10;
        int remaining = n;

        int multiplier = 1;
        while (n > 0) {
            n /= 10;
            multiplier *= 10;
        }
        rotatedNumber = lastDigit * multiplier + remaining;
        System.out.println(rotatedNumber);
        // System.out.println(lastDigit + "," + remaining + "," + multiplier);

    }
}
