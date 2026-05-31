public class CheckifDigitsAreSorted {
    public static void main(String[] argu) {
        int n = 12345;
        int current = 0;
        int prev = 10;

        while (n > 0) {
            current = n % 10;
            if (current < prev) {
                System.out.println("Digits are not sorted");
                return;
            }
            prev = current;
            n = n / 10;
        }

    }
}
