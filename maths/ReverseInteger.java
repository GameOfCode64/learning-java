package maths;

public class ReverseInteger {
    static int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            reversed = reversed * 10 + rem;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-131));
    }
}