package maths;

public class SumofDigit {
    // ! Problem
    // ! Given a positive integer, find the sum of all its digits.
    public static void main(String[] argu) {

        int num = 1001;
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum += n;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
