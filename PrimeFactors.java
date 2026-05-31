public class PrimeFactors {
    public static void main(String[] argu) {
        int n = 12;
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            } else {
                i++;
            }
        }
    }
}
