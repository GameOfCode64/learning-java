package maths;

public class DisariumNumber {
    public static void main(String[] argu) {
        int n = 77;
        int copy = n;
        int sum = 0;

        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += (int) Math.pow(rem, digits);
            digits--;
        }
        if (copy == sum) {
            System.out.println("This is a Disarium Number");
        } else {
            System.out.println("This is NOT a Disarium Number");
        }
    }
}