package maths;

public class Strong {
    public static int fact(int num) {
        if (num < 0) {
            System.err.println("Number Can't be negative");
            return -1;
        }

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] argu) {
        int num = 145;
        int copy = num;
        int strong = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            int fact = fact(rem);
            strong += fact;
        }

        if (strong == copy) {
            System.err.println("Strong Number");
        } else {
            System.err.println("Not a Strong Number");
        }

    }
}
