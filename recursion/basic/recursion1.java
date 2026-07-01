package basic;

public class recursion1 {
    public static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // Factorial of a number using recursion

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int productOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1342;
        System.out.println(productOfDigits(n));
    }
}