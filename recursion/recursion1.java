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

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fib(n));
    }
}