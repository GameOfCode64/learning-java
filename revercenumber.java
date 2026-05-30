public class revercenumber {

    public static void main(String[] argu) {
        int n = 1234;
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            reverse = reverse * 10 + rem;
        }

        System.err.println(reverse);

    }
}
